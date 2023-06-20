package mx.com.cuh.cuh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.com.cuh.cuh.entity.TbPerson;

@org.springframework.stereotype.Repository
public interface TbPersonRepository 
extends CrudRepository<TbPerson, Long> {

	/*los métodos findAll, deleteByAll, findById no son necesarios en esta clase ya que se heredan directamente de CrudRepository estan como muestra*/
	List<TbPerson> findAll();  //SELECT * FROM PERSON
	void deleteById(Long idPerson);
	
	//SELECT FROM PERSON WHERE ID_PERSON =? Te manda una sola persona.
	Optional<TbPerson> findByIdAnd(Long id);
	
	@Query(value = "select max(id_person)+1 from person", nativeQuery = true)
	Long obtenerMaximoIdPerson();


}
