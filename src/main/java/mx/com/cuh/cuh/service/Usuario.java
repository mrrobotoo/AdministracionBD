package mx.com.cuh.cuh.service;


import mx.com.cuh.cuh.dto.PersonaDTO;
import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.entity.TbPerson;

public interface Usuario {
	Respuesta<TbPerson> obtenerPersonas();
	
	Respuesta<String> borrarPersona(Long idPerson);
	
	Respuesta<String> insertarPersona(PersonaDTO persona);

}
