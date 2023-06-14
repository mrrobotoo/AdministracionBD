package mx.com.cuh.cuh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioImpl implements Usuario {
@Autowired
	private TbPersonRepository tbPersonRepository;

@Override
	public List<TbPerson> obtenerPersonas(){
		return tbPersonRepository.findAll();
		
		
	}


}
