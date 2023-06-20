package mx.com.cuh.cuh.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import mx.com.cuh.cuh.entity.TbPerson;

@org.springframework.stereotype.Repository

public interface TbPersonRepository 
extends CrudRepository<TbPerson, Long> {
	/*Los métodos findAll,deleteById,findById no son necesarios en 
	 * esta clase ya que que se heredan directamente de CrudRepository
	 * estan aquí solamente como muestra*/
	//Trae todos los datos, es decir un select * from person;
	List<TbPerson> findAll();
	//DELETE FROM PERSON WHERE ID_PERSON =?
    void deleteById(Long idPerson);
    //SELECT FROM PERSON WHERE ID_PERSON =?    TE MANDA UNA SOLA PERSONA
    Optional<TbPerson> findById(Long id); 
    
    @Query(value = "select max(id_person) +1 from person",nativeQuery = true )
    Long obtenerMaximoIdPerson();
}
