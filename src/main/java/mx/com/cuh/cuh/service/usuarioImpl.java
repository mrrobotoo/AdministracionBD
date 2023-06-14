package mx.com.cuh.cuh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cuh.cuh.entity.TbPerson;
import mx.com.cuh.cuh.repository.TbPersonRepository;

public class usuarioImpl implements Usuario {
	@Autowired
	private TbPersonRepository tbPersonRepository;
	
	@Override
	public List<TbPerson> obtenerPersonas() {
		// TODO Auto-generated method stub
		return tbPersonRepository.findAll();
	}

}