package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Usuario;
import com.empresa.service.DeporteService;

@RestController
@RequestMapping("/rest/util")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilController {

	@Autowired
	private DeporteService  deporteService;

	@GetMapping("/deporte")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaAlumno(){
		List<Usuario> lista = deporteService.listaDeporte();
		return ResponseEntity.ok(lista);
	}
	
}
