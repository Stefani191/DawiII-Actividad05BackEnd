package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Ciclo;
import com.empresa.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;

	@Override
	public List<Ciclo> listaAlumno() {
		return repository.findAll();
	}

	@Override
	public Ciclo insertaActualizaAlumno(Ciclo obj) {
		return repository.save(obj);
	}

}
