package mx.com.cuh.cuh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.com.cuh.cuh.dto.PersonaDTO;
import mx.com.cuh.cuh.dto.RespuestaEliminar;
import mx.com.cuh.cuh.entity.TbPerson;
import mx.com.cuh.cuh.service.Usuario;


@SuppressWarnings("hiding")
@org.springframework.web.bind.annotation.RestController
public class RestController<TbPerson, Usuario> {
	@Autowired
	private Usuario usuario;

	@PostMapping(value = "/insertarPersonas")
	public void insertarPersonas(
			 PersonaDTO persona) {
		
		System.out.println("info super grande"
		+ persona.getNombre());
	}
	
	@DeleteMapping(value = "/borrarPersona")
	public RespuestaEliminar borrarPersona(@RequestParam 
			Long idPerson) {
		return ((mx.com.cuh.cuh.service.Usuario) usuario).borrarPersona(idPerson);
}	
	
	@PutMapping(value = "/actualizarPersonas")
	public void actualizarPersonas2() {
		
		System.out.println("actualizar");
	}
}