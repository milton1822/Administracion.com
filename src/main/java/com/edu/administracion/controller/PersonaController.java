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

import com.edu.administracion.interfaces.IPersona;
import com.edu.administracion.modelo.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private IPersona service;
	
	@GetMapping("/listar")
	public Iterable<Persona>listar(){
		return service.findAll();
	}
	
	@PostMapping("/crear")
	public Persona guardar(@RequestBody Persona persona) {
		return service.save(persona);
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Persona>empleado(@PathVariable int id){
		return service.findById(id);
	}
	
	@DeleteMapping("eliminar/id")
	public void eliminar(@PathVariable int id) {
		service.deleteById(id);
	}
	

}
