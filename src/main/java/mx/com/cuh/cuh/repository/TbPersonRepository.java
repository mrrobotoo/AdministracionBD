package mx.com.cuh.cuh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import mx.com.cuh.cuh.entity.TbPerson;

@org.springframework.stereotype.Repository
public interface TbPersonRepository
extends CrudRepository<TbPerson, Long> {
	//SELECT * FROM PERSON
	List<TbPerson> findAll();
	void deleteById(Long idPerson);
	
	Optional<TbPerson> findById(Long id);
}
