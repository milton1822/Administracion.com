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

import com.edu.administracion.interfaces.IPago;
import com.edu.administracion.modelo.Pago;

@RestController
@RequestMapping("/pago")
public class PagoController {
	
	@Autowired
	private IPago service;

	@GetMapping("/listar")
	public Iterable<Pago>listar(){
		return service.findAll();
	}
	
	@PostMapping("/crear")
	public Pago guardar(@RequestBody Pago pago) {
		return service.save(pago);
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Pago>pago(@PathVariable int id){
		return service.findById(id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public Pago actualizar(@RequestBody Pago p) {
		return service.save(p);
	}
	
}
