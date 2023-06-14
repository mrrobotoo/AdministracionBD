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
import mx.com.cuh.cuh.service.Usuario;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private Usuario usuario;
	
	@GetMapping(value = "/obtenerpersonas")
	public List<TbPerson> listaPersonas() {
		
		return usuario.obtenerPersonas(); 
	}
	
	@GetMapping(value = "/obtenerinfo")
	public void listaPersonas2(@RequestParam 
			String nombre) {
		System.out.println("entro pero a obtenerinfo"+nombre);
	}
	
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
	}


	@PutMapping(value = "/update")
		public void actualizarPersonas() {
		
			System.out.println("Actualizado");
	}
}