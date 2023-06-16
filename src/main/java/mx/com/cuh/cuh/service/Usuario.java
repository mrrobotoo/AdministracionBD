package mx.com.cuh.cuh.service;


import java.util.List;

import mx.com.cuh.cuh.dto.Respuesta2;
import mx.com.cuh.cuh.entity.TbPerson;

public interface Usuario {
	List<TbPerson> obtenerPersonas();
	Respuesta2 borrarPersona(Long idPerson);

}
