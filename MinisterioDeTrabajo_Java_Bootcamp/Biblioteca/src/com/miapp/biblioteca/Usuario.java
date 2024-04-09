package com.miapp.biblioteca;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String numeroDeIdentificacion;
	private ArrayList<Libro> librosPrestados;
	
	public Usuario() {}
	
	public Usuario(String nombre, String numeroDeIdentificacion) {
		this.nombre = nombre;
		this.numeroDeIdentificacion = numeroDeIdentificacion;
		this.librosPrestados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroDeIdentificacion() {
		return numeroDeIdentificacion;
	}

	public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
		this.numeroDeIdentificacion = numeroDeIdentificacion;
	}

	public ArrayList<Libro> getLibrosPrestados() {
		return librosPrestados;
	}

	public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", numeroDeIdentificacion=" + numeroDeIdentificacion + ", librosPrestados="
				+ librosPrestados + "]";
	}
}
