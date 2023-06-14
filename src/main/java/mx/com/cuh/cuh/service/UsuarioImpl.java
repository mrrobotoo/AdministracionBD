package mx.com.cuh.cuh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.cuh.cuh.repository.TbPersonRepository;
import mx.xom.cuh.cuh.entity.TbPerson;
@Service
public class UsuarioImpl implements Usuario {
	@Autowired
	private TbPersonRepository tbPersonRepository;
	
	@Override
	public List<TbPerson> obtenerPersonas() {
		return tbPersonRepository.findAll();
	}
	
	

}
