package mx.com.cuh.cuh.repository;

import java.util.List;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.repository.CrudRepository;
import mx.com.cuh.cuh.entity.TbPerson;


@org.springframework.stereotype.Repository
public interface TbPersonRepository extends CrudRepository<TbPerson, Long>{
	//SELECCT * FROM 
	List<TbPerson> findALL();
	
}
