package mx.com.cuh.cuh.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Respuesta <T>{
	private String mensaje;
	private List<T> listasPersona;
	
	public List<T> getListasPersona(){
		return listasPersona;
	}
	

	public void setListasPersona(List<T> listasPersona) {
		this.listasPersona = listasPersona;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
