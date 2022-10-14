package com.edu.administracion.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.administracion.interfaces.IAdministrador;
import com.edu.administracion.modelo.Administrador;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
	
	@Autowired
	private IAdministrador service;
	
	@GetMapping("/listar")
	public Iterable<Administrador>listar(){
		return service.findAll();
	}

	@PostMapping("/crear")
	public Administrador guardar(@RequestBody Administrador a) {
		return service.save(a);
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Administrador>administrador(@PathVariable int id){
		return service.findById(id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		service.deleteById(id);
	}
}
