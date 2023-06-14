package mx.com.cuh.cuh.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.xom.cuh.cuh.entity.TbPerson;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface TbPersonRepository 
extends CrudRepository<TbPerson, Long>{
	//select from person 
	List<TbPerson> findAll();

}
