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

import com.edu.administracion.interfaces.IPropietario;
import com.edu.administracion.modelo.Propietario;

//@Controller
@RestController
@RequestMapping("/prueba")
public class PropietarioController {
	
	@Autowired
	private IPropietario service;
	
	@GetMapping("/listarP")
	public Iterable<Propietario> listarPropieatrio() {
		return service.findAll();
	}
	
	@PostMapping("/crear")
	public Propietario guardar(@RequestBody Propietario propietario) {
		return service.save(propietario);
	}
	
	@GetMapping("/buscarId/{id}")
	public Optional<Propietario>propietario(@PathVariable int id){
		return service.findById(id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		service.deleteById(id);
	}

}
