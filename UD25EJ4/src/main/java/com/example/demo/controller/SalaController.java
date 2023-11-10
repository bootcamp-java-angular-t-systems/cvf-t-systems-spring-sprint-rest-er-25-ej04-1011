package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Sala;
import com.example.demo.service.SalaServiceImpl;

@RestController
@RequestMapping("/sala")
public class SalaController {

	@Autowired
	SalaServiceImpl salaService;
	
	@GetMapping("/all")
	public List<Sala> getAll() {
		return salaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Sala getById(@PathVariable(name="id") Long id) {
		return salaService.findById(id);
	}
	
	
	@PostMapping("")
	public Sala create(@RequestBody Sala sala) {
		return salaService.save(sala);
	}
	
	@PutMapping("/{id}")
	public Sala update(@PathVariable(name="id") Long id,@RequestBody Sala sala) {
		
		Sala salaSeleccionado= new Sala();
		
		salaSeleccionado= salaService.findById(id);
		salaSeleccionado.setNombre(sala.getNombre());
		salaSeleccionado.setCalificacionEdad(sala.getCalificacionEdad());
		salaSeleccionado.setPelicula(sala.getPelicula());
		
		
		salaSeleccionado = salaService.update(salaSeleccionado);
		
		return salaSeleccionado;
	}
	
	@DeleteMapping("/{id}")
	public void deleteSala(@PathVariable(name="id") Long id) {
		salaService.delete(id);
	}
}
