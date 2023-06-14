package mx.com.cuh.cuh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import mx.com.cuh.cuh.dto.PersonaDTO;
import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.entity.TbPerson;
<<<<<<< HEAD
=======
import mx.com.cuh.cuh.service.Usuario;
>>>>>>> origin/JEAA

@org.springframework.web.bind.annotation.RestController
public class RestController<TbPerson, Usuario> {
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private Usuario usuario;
	
	@GetMapping(value = "/obtenerpersonas")
	public List<TbPerson> listaPersonas() {
		
<<<<<<< HEAD
		return usuario.obtenerPersona();
=======
		return usuario.obtenerPersonas(); 
>>>>>>> origin/JEAA
	}
	
	@DeleteMapping(value = "/eliminarPersonas")
	public void insertarPersonas() {
	
<<<<<<< HEAD
		
		System.out.println("eliminar");
=======
	@PostMapping(value = "/insertarPersonas")
	public void insertarPersonas(
			@RequestBody PersonaDTO persona) {
		
		System.out.println("info super grande"
		+ persona.getNombre());
	}
	
	@DeleteMapping(value = "/borrarPersona")
	public void borrarPersonas() {
		Long idPerson = 40269L;
		usuario.borrarPersona(idPerson);
	}
	
	@PutMapping(value = "/updateperson")
	public void actualizarpersonas() {
		System.out.println("ACTUALIZO");
>>>>>>> origin/JEAA
	}
	
	@PutMapping(value = "/actualizarPersnas")
	public void actualizarPersonas() {
		System.out.println("Actualiza");
	}
}