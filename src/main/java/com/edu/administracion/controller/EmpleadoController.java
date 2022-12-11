package com.edu.administracion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.administracion.interfaces.IEmpleado;
import com.edu.administracion.modelo.Empleado;

@RestController
@RequestMapping("/empleado")
//@CrossOrigin(origins = "*" , methods = {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE})
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpleadoController {

	@Autowired
	private IEmpleado service;
	
	@GetMapping("/listar")
	public Iterable<Empleado>listar(){
		//List<Empleado> listaempleados = service.findAll();
		return service.findAll();
	}
	
	@PostMapping("/crear")
	public Empleado guardar(@RequestBody Empleado empleado) {
		return service.save(empleado);
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Empleado>empleado(@PathVariable int id){
		return service.findById(id);
	}
	
	@DeleteMapping("eliminar/id")
	public void eliminar(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public Empleado actualizar(@RequestBody Empleado empleado) {
		return service.save(empleado);
	}
}
