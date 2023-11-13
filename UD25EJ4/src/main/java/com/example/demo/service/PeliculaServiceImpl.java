package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	IPeliculaDAO peliculaDAO;
	
	public List<Pelicula> findAll() {
		return peliculaDAO.findAll();
	}
	
	public Pelicula findById(Long id) {
		return peliculaDAO.findById(id).get();
	}
	
	public Pelicula save(Pelicula pelicula) {
		return peliculaDAO.save(pelicula);
	}
	
	public Pelicula update(Pelicula pelicula) {
		return peliculaDAO.save(pelicula);
	}
	
	public void delete(Long id) {
		peliculaDAO.deleteById(id);
	}
	
}
