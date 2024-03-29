package com.tavo.apirest.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tavo.apirest.models.entity.Personas;

public interface PersonasDAO extends CrudRepository<Personas, Integer>{

	

	
	public List<Personas>findAll();

    public Optional<Personas> findById(Integer cedula);
	
	public Personas save(Personas p);
	
	public void delete(Personas p);
	
	
}
