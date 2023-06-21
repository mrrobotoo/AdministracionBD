package mx.com.cuh.cuh.service;

<<<<<<< HEAD
import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.dto.RespuestaEliminar;
import mx.com.cuh.cuh.entity.TbPerson;

public interface Usuario {

	Respuesta<TbPerson> obtenerPersonas();
	RespuestaEliminar borrarPersona(Long idPerson);

=======
import mx.com.cuh.cuh.dto.PersonaDTO;
import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.entity.TbPerson;

public interface Usuario {
	Respuesta<TbPerson> obtenerPersonas();
	 
    Respuesta<String> borrarPersona(Long idPerson);
    
    Respuesta<String> insertarPersona(PersonaDTO persona);
    
    Respuesta<String> updatePersona(PersonaDTO persona);
>>>>>>> origin/Flor_Adilene_Luna_Solano
}

