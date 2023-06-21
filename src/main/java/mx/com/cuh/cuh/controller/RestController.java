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
<<<<<<< HEAD
public class RestController<TbPerson, Usuario> {
	@Autowired
	private Usuario usuario;

	@PostMapping(value = "/insertarPersonas")
	public void insertarPersonas(
			 PersonaDTO persona) {
=======
public class RestController {
	@Autowired
	private Usuario usuario;
	
	
	@GetMapping(value = "/obtenerPersonas")
	public Respuesta<TbPerson> listaPersonas() {
		return usuario.obtenerPersonas();
	}
	
	@GetMapping(value = "/obtenerinfo")
	public void listaPersonas2(@RequestParam 
			String nombre) {
		System.out.println("entro pero a obtenerinfo"+nombre);
	}
	
	@PostMapping(value = "/insertarPersonas")
	public Respuesta insertarPersonas(
			@RequestBody PersonaDTO persona) {
		return usuario.insertarPersona(persona);
>>>>>>> origin/Flor_Adilene_Luna_Solano
		
	}
	
	@DeleteMapping(value = "/borrarPersona")
<<<<<<< HEAD
	public RespuestaEliminar borrarPersona(@RequestParam 
			Long idPerson) {
		return ((mx.com.cuh.cuh.service.Usuario) usuario).borrarPersona(idPerson);
}	
	
	@PutMapping(value = "/actualizarPersonas")
	public void actualizarPersonas2() {
		
		System.out.println("actualizar");
	}
}
=======
	public Respuesta borrarPersonas(@RequestParam 
			Long idPerson) {
		return usuario.borrarPersona(idPerson);	
	}
	
	@PutMapping(value = "/updateperson")
	public Respuesta actualizarpersonas(@RequestBody PersonaDTO persona) {
		return usuario.updatePersona(persona);
	}
	

}
>>>>>>> origin/Flor_Adilene_Luna_Solano
