package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> findAll();

	public Pelicula findById(Long id);

	public Pelicula update(Pelicula pelicula);

	public Pelicula save(Pelicula pelicula);

	public void delete(Long id);
}
