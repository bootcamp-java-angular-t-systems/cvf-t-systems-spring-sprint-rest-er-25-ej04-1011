package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Sala;

public interface ISalaService {

	public List<Sala> findAll();

	public Sala findById(Long id);

	public Sala update(Sala sala);

	public Sala save(Sala sala);

	public void delete(Long id);
}
