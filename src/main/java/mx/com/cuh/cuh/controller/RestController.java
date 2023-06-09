package mx.com.cuh.cuh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import mx.com.cuh.cuh.dto.PersonaDTO;
import mx.com.cuh.cuh.dto.Respuesta;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping(value = "/obtenerpersonas")
	public Respuesta listaPersonas() {
		
		List<PersonaDTO> listasPersonas
		= new ArrayList<PersonaDTO>();
		
		PersonaDTO persona1 = new PersonaDTO();
		persona1.setNombre("juan");
		persona1.setEdad(15);
		
		listasPersonas.add(persona1);
		
		Respuesta reponse = new Respuesta();
		reponse.setListasPersona(listasPersonas);
		reponse.setMensaje("Todo okas");
		
		return reponse; 
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
	
	@DeleteMapping(value = "/insertarPersonas")
	public void insertarPersonas2() {
		
		System.out.println("eliminar");
	}
}
