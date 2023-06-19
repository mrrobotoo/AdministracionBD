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
	public Respuesta<TbPerson> obtenerPersonas() {
		Respuesta<TbPerson> response = new Respuesta<>();
        response.setListasPersona(tbPersonRepository.findAll());
        response.setMensaje("ok");
		return response;
	}

	@Override
    public Respuesta<String> borrarPersona(Long idPerson) {
        Optional<TbPerson> persona =
                tbPersonRepository.findById(idPerson);
        Respuesta<String> response = new Respuesta<>();
        
        String mensaje = (persona.isPresent()) ? "Todo bien, Todo correcto" : "El usuario " + idPerson + " no existe";
        
        tbPersonRepository.deleteById(idPerson);
   
        response.setMensaje(mensaje);
        return response;
   }


	
}