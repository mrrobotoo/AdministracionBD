package mx.com.cuh.cuh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import mx.com.cuh.cuh.entity.TbPerson;

public interface TbPersonRepository
extends CrudRepository<TbPerson, Long> {
	//SELECT * FROM PERSON
	List<TbPerson> findAll();
	//delete from person  where  id_person = 99;
	void deleteById(Long idPerson);
	//select * from person  where  id_person = ?
	Optional<TbPerson> findById(Long id);
}
