package mx.com.cuh.cuh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.com.cuh.cuh.dto.PersonaDTO;


@SuppressWarnings("hiding")
@org.springframework.web.bind.annotation.RestController
public class RestController<TbPerson, Usuario> {
	@Autowired
	private Usuario usuario;

	
	@GetMapping(value = "/obtenerpersonas")
	public List<TbPerson> listaPersonas() {
		return null;
	}
	
	@PostMapping(value = "/insertarPersonas")
	public void insertarPersonas(
			 PersonaDTO persona) {
		
		System.out.println("info super grande"
		+ persona.getNombre());
	}
	
	@DeleteMapping(value = "/borrarPersona")
	public void borrarPersona(@RequestParam long idPerson) {
		usuario.borrarpersona;
	}
	
	@PutMapping(value = "/actualizarPersnas")
	public void actualizarPersonas() {
		System.out.println("Actualiza");
	}
}