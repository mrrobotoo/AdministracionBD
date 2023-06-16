package mx.com.cuh.cuh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.entity.TbPerson;
import mx.com.cuh.cuh.repository.TbPersonRepository;

@Service
public class UsuarioImpl implements Usuario {
	@Autowired
	private TbPersonRepository tbPersonRepository;
	
	@Override
	public List<TbPerson> obtenerPersonas() {
		return tbPersonRepository.findAll();
	}

	@Override
	public void RespuestaEliminar borrarPersona(Long idPerson) {
		Optional<TbPerson> persona = 
				tbPersonRepository.findById(idPerson);
		RespestaEliminar response = new RespuestaEliminar();
		if (persona.isPresent()) {
			tbPersonRepository.deleteById(idPerson);
			response.setMensaje("SE elimino correctamente");
	}else{	
		response.setMensaje("El usuario" + idPerson + )
		
	}
	
	}

}
