package com.edu.administracion.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.administracion.interfaces.I_Inmueble;
import com.edu.administracion.modelo.Inmueble;

@RestController
@RequestMapping("/inmueble")
public class InmuebleController {
	
	@Autowired
	private I_Inmueble service;
	
	@GetMapping("/listar")
	public Iterable<Inmueble>listar(){
		return service.findAll();
	}
	
	@PostMapping("/crear")
	public Inmueble guardar(@RequestBody Inmueble inmueble) {
		return service.save(inmueble);
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Inmueble>inmueble(@PathVariable int id){
		return service.findById(id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public Inmueble actualizar(@RequestBody Inmueble i) {
		return service.save(i);
	}
	
	
}
