package mx.com.cuh.cuh.service;

<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> origin/Flor_Adilene_Luna_Solano
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.dto.RespuestaEliminar;
import mx.com.cuh.cuh.entity.TbPerson;
import mx.com.cuh.cuh.repository.TbPersonRepository;
import mx.com.cuh.cuh.dto.PersonaDTO;
import mx.com.cuh.cuh.dto.Respuesta;



@Service

public class UsuarioImpl implements Usuario{
	@Autowired
	private TbPersonRepository tbPersonRepository;

	
	@Override
<<<<<<< HEAD
	public Respuesta<TbPerson> obtenerPersonas(){
		Respuesta<TbPerson> response = new Respuesta<>();
		response.setListasPersona(tbPersonRepository.findAll());
		response.setMensaje("ok");
		return response;
	}

	@Override
	public RespuestaEliminar borrarPersona(Long idPerson) {
		Optional<TbPerson> persona =
				tbPersonRepository.findById(idPerson);
		RespuestaEliminar response = new RespuestaEliminar();
		
		String mensaje = (persona.isPresent())?"Todo okas" : "Todo no esta okas";
		
		
			tbPersonRepository.deleteById(idPerson);
			response.setMensaje(mensaje);
		return response;
	}
	
=======
	public Respuesta <TbPerson> obtenerPersonas(){
		Respuesta<TbPerson> response = new Respuesta <>();
		response.setListasPersona(tbPersonRepository.findAll());
		response.setMensaje("ok");
	
		return response;
	}

    @Override
    public  Respuesta<String> borrarPersona(Long idPerson) {
    	Optional<TbPerson> persona = 
    			tbPersonRepository.findById(idPerson); 
    	 Respuesta<String> response = new Respuesta<>();
    	
    	String mensaje = (persona.isPresent()) ? "Se eliminó correctamente" : "El usuario " + idPerson + " no exixte";
    	
    	tbPersonRepository.deleteById(idPerson);
    	response.setMensaje(mensaje);
		
        return response;
        
        
    }

	@Override
	public Respuesta<String> insertarPersona(PersonaDTO persona) {
		Long idPersonMaximo =tbPersonRepository.obtenerMaximoIdPerson();
		
		TbPerson personaFinal = new TbPerson();
		personaFinal.setIdPerson(idPersonMaximo);
		personaFinal.setLogin(persona.getLogin());
		personaFinal.setName(persona.getName());
		//Insert into person(id_person,login) values (?,?)
		tbPersonRepository.save(personaFinal);
		Respuesta<String> response = new Respuesta<>();
		response.setMensaje("Se insertó correctamente");
		return response;
	}

	@Override
	public Respuesta<String> updatePersona(PersonaDTO persona) {
		TbPerson personaFinal =
				tbPersonRepository.findById(persona.getIdPerson()).get();
		
		personaFinal.setLogin(persona.getLogin());
		personaFinal.setName(persona.getName());
		//Insert into person(id_person,login) values (?,?)
		tbPersonRepository.save(personaFinal);
		Respuesta<String> response = new Respuesta<>();
		response.setMensaje("Se actualizo correctamente");
		return response;
	}
>>>>>>> origin/Flor_Adilene_Luna_Solano
}

