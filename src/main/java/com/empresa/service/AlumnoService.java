package com.empresa.service;

import java.util.List;

import com.empresa.entity.Ciclo;

public interface AlumnoService {

	public abstract List<Ciclo> listaAlumno();

	public abstract Ciclo insertaActualizaAlumno(Ciclo obj);

}
