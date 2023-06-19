package mx.com.cuh.cuh.service;

import mx.com.cuh.cuh.dto.Respuesta;
import mx.com.cuh.cuh.dto.RespuestaEliminar;
import mx.com.cuh.cuh.entity.TbPerson;

public interface Usuario {

	Respuesta<TbPerson> obtenerPersonas();
	RespuestaEliminar borrarPersona(Long idPerson);

}
