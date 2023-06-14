package mx.com.cuh.cuh.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.cuh.cuh.entity.TbPerson;
@Repository
public interface TbPersonRepository 
extends CrudRepository<TbPerson, Long> {
	List<TbPerson> findAll();
