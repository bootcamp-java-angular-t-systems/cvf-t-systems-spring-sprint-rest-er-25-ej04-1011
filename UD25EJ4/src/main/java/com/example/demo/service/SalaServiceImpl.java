package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

@Service
public class SalaServiceImpl {

	@Autowired
	ISalaDAO salaDAO;
	
	public List<Sala> findAll() {
		return salaDAO.findAll();
	}
	
	public Sala findById(Long id) {
		return salaDAO.findById(id).get();
	}
	
	public Sala save(Sala sala) {
		return salaDAO.save(sala);
	}
	
	public Sala update(Sala sala) {
		return salaDAO.save(sala);
	}
	
	public void delete(Long id) {
		salaDAO.deleteById(id);
	}
}
