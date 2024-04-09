package com.miapp.biblioteca.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.miapp.biblioteca.Libro;

public class LibroServicio {
	private ArrayList<Libro> libros;
	
	public LibroServicio(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	public void crearLibro(String autor, String genero, String isbn, String titulo) {
		Libro nuevoLibro = new Libro();
		nuevoLibro.setAutor(autor);
		nuevoLibro.setGenero(genero);
		nuevoLibro.setIsbn(isbn);
		nuevoLibro.setTitulo(titulo);
		libros.add(nuevoLibro);
		return;
	}
	
	public ArrayList<Libro> obtenerTodosLosLibros() {
		return libros;
	}
	
	public void actualizarLibro(String isbn, String nuevoAutor, String nuevoGenero, String nuevoTitulo) {
		for(Libro libro : libros) {
			if(libro.getIsbn().equals(isbn)) {
				libro.setAutor(nuevoAutor);
				libro.setGenero(nuevoGenero);
				libro.setTitulo(nuevoTitulo);
				return;
			}
		}
	}
	
	public void eliminarLibro(String isbn) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			if(it.next().getIsbn().equals(isbn)) {
				it.remove();
				return;
			}
		}
	}
	
	public Libro buscarLibroPorISBN(String isbn) {
		for(Libro libro : libros) {
			if(libro.getIsbn().equals(isbn)) {
				return libro;
			}
		}
		return null;
	}
	
	public ArrayList<Libro> buscarLibrosPorTitulo(String titulo){
		ArrayList<Libro> librosEncontrados = new ArrayList<>();
		for(Libro libro : libros) {
			if(libro.getTitulo().equalsIgnoreCase(titulo)) {
				librosEncontrados.add(libro);
			}
		}
		return librosEncontrados;
	}
	
	public boolean verificarDisponibilidad(Libro libro) {
		return libro.isDisponible();
	}
}
