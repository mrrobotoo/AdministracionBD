package mx.com.cuh.cuh.service;

import java.util.List;
import mx.com.cuh.cuh.controller.RestController;
import mx.com.cuh.cuh.service.Usuario;

import mx.com.cuh.cuh.entity.TbPerson;

public interface Usuario {
	List<TbPerson> obtenerPersonas();
}
