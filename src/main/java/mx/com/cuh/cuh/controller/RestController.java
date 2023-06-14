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

@org.springframework.web.bind.annotation.RestController
public class RestController<TbPerson, Usuario> {
	@Autowired
	private Usuario usuario;
	
	@GetMapping(value = "/obtenerpersonas")
	public List<TbPerson> listaPersonas() {
		
		return usuario.obtenerPersona();
	}
	
	@DeleteMapping(value = "/eliminarPersonas")
	public void insertarPersonas() {
	
		
		System.out.println("eliminar");
	}
	
	@PutMapping(value = "/actualizarPersnas")
	public void actualizarPersonas() {
		System.out.println("Actualiza");
	}
}