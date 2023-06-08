package mx.com.cuh.cuh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.com.cuh.cuh.dto.PersonaDTO;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping(value = "/obtenerpersonas")
	public List<PersonaDTO> listaPersonas() {
		
		List<PersonaDTO> listasPersonas
		= new ArrayList<PersonaDTO>();
		
		PersonaDTO persona1 = new PersonaDTO();
		persona1.setNombre("juan");
		persona1.setEdad(15);
		
		listasPersonas.add(persona1);
		
		System.out.println("entro");
		return listasPersonas; 
	}
	
	@GetMapping(value = "/obtenerinfo")
	public void listaPersonas2(@RequestParam 
			String nombre) {
		System.out.println("entro pero a obtenerinfo"+nombre);
	}
}
