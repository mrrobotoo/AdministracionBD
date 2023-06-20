package mx.com.cuh.cuh.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.cuh.dto.PersonaDTO;
import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.entity.TbPerson;
import mx.com.cuh.cuh.repository.TbPersonRepository;

@Service

public class UsuarioImpl implements Usuario{
	
	@Autowired
	private TbPersonRepository tbPersonRepository;

	@Override
	public Respuesta<TbPerson> obtenerPersonas() {
		Respuesta<TbPerson> response = new Respuesta<>();
		response.setListasPersona(tbPersonRepository.findAll());
		response.setMensaje("La lista de las personas es la siguiente: ");
		return response;
	}

	@Override
	public Respuesta<String> borrarPersona(Long idPerson) {
		Optional<TbPerson> persona =
		tbPersonRepository.findById(idPerson);
		Respuesta<String> response = new Respuesta<>();
		
		String mensaje = (persona.isPresent()) ? "Todo okas" : "Todo no okas"; 
		
			tbPersonRepository.deleteById(idPerson);
			response.setMensaje("Se eliminó correctamente");
				
		return response;
		
		
	}

	@Override
	public Respuesta<String> insertarPersona(PersonaDTO persona) {
		Long idPerson =tbPersonRepository.obtenerMaximoIdPerson();
		
		TbPerson personaFinal = new TbPerson();
		personaFinal.setIdPerson(idPersonMaximo);
		personaFinal.setLogin(persona.getLogin());
		
		//Insert into person (id_person,login) values(?,?)
		tbPersonRepository.save(personaFinal);
		Respuesta<String> response = new Respuesta<>();
		response.setMensaje("Se inserto correctamente");
		 return response;
	}

}
