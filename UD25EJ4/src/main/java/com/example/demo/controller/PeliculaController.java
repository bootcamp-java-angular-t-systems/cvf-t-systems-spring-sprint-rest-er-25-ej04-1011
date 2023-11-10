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

import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaService;
	
	@GetMapping("/all")
	public List<Pelicula> getAll() {
		return peliculaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Pelicula getById(@PathVariable(name="id") Long id) {
		return peliculaService.findById(id);
	}
	
	
	@PostMapping("")
	public Pelicula create(@RequestBody Pelicula pelicula) {
		return peliculaService.save(pelicula);
	}
	
	@PutMapping("/{id}")
	public Pelicula update(@PathVariable(name="id")Long id,@RequestBody Pelicula pelicula) {
		
		Pelicula articuloSeleccionado= new Pelicula();
		
		articuloSeleccionado= peliculaService.findById(id);
		
		articuloSeleccionado.setNombre(pelicula.getNombre());
		
		articuloSeleccionado = peliculaService.update(articuloSeleccionado);
		
		return articuloSeleccionado;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name="id") Long id) {
		peliculaService.delete(id);
	}
}