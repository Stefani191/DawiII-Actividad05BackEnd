package com.empresa.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Usuario;
import com.empresa.repository.DeporteRepository;

@Service
public class DeporteServiceImpl implements DeporteService{

	@Autowired
	private DeporteRepository repositorio;

	@Override
	public List<Usuario> listaDeporte() {
		return repositorio.findAll();
	} 
	
	

}


