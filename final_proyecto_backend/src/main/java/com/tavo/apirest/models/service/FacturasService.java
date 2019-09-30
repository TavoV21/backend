package com.tavo.apirest.models.service;

import java.util.List;

import com.tavo.apirest.models.entity.Facturas;


public interface FacturasService {

	public List<Facturas> listar();

	public Facturas listarid(int factnumero);
	
	public Facturas agregar(Facturas fac);
	
	public Facturas editar(Facturas fac);

	public Facturas eliminar(int factnumero);
	
	
}
