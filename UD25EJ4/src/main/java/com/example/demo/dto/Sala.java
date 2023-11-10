package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salas")
public class Sala {

	@Id
	@Column(name = "codigo")
	private Long id;

	private String nombre;
	private int calificacionEdad;

	@ManyToOne
	@JoinColumn(name = "pelicula_id")
	private Pelicula pelicula;

	public Sala(Long id, String nombre, int calificacionEdad, Pelicula pelicula) {
		// super();
		this.id = id;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
		this.pelicula = pelicula;
	}

	public Sala() {
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

	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

}
