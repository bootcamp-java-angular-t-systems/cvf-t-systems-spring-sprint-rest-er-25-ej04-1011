package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo") 	
	private Long id;
	private String nombre;

	@OneToMany
	@JoinColumn(name = "pelicula_id")
	private List<Sala> sala;

	public Pelicula(Long id, String nombre) {
		// super();
		this.id = id;
		this.nombre = nombre;
	}

	public Pelicula() {
		// super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Pelicula")
	public List<Sala> getSala() {
		return this.sala;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

}
