package com.tavo.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tavo.apirest.models.dao.FacturasDAO;
import com.tavo.apirest.models.entity.Facturas;

@Service
public class FacturasServiceImpl implements FacturasService{

	@Autowired
	private FacturasDAO facturaDAO;
	
	
	@Override
	public List<Facturas> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facturas listarid(int factnumero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facturas agregar(Facturas fac) {
		// TODO Auto-generated method stub
		return facturaDAO.save(fac);
	}

	@Override
	public Facturas editar(Facturas fac) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facturas eliminar(int factnumero) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
