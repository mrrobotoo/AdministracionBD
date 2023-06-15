package mx.com.cuh.cuh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.cuh.dto.RespuestaEliminar;
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
	public RespuestaEliminar borrarPersona(Long idPerson) {
		Optional<TbPerson> persona =
				tbPersonRepository.findById(idPerson);
		RespuestaEliminar response = new RespuestaEliminar();
		if (persona.isPresent()) {
			tbPersonRepository.deleteById(idPerson);
			response.setMensaje("Se eliminó correctamente");
		}else {
			response.setMensaje("El usuario " + idPerson + " no existe");
		}
		
		return response;
	}

	
}
