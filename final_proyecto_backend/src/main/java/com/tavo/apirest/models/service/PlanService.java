package com.tavo.apirest.models.service;

import java.util.List;

import com.tavo.apirest.models.entity.Plan;


public interface PlanService {

	public List<Plan> listar();

	public Plan listarid(String planvalor);
	
	public Plan agregar(Plan pl);
	
	public Plan editar(Plan pl);

	public Plan eliminar(String planvalor);
	
	
}
