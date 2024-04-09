package com.miapp.biblioteca.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.miapp.biblioteca.Libro;
import com.miapp.biblioteca.Usuario;

public class UsuarioServicio {
	private ArrayList<Usuario> usuarios;
	
	public UsuarioServicio(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void crearUsuario(String nombre, String numeroDeIdentificacion, ArrayList<Libro> librosPrestados) {
		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setNombre(nombre);
		nuevoUsuario.setNumeroDeIdentificacion(numeroDeIdentificacion);
		nuevoUsuario.setLibrosPrestados(librosPrestados);
		usuarios.add(nuevoUsuario);
		return;
	}
	
	public ArrayList<Usuario> obtenerTodosLosUsuarios(){
		return usuarios;
	}
	
	public void actualizarUsuario(String numeroDeIdenticacion, String nuevoNombre, ArrayList<Libro> nuevosLibrosPrestados) {
		for(Usuario usuario : usuarios) {
			if(usuario.getNumeroDeIdentificacion().equals(numeroDeIdenticacion)) {
				usuario.setNombre(nuevoNombre);
				usuario.setLibrosPrestados(nuevosLibrosPrestados);
				return;
			}
		}
	}
	
	public void eliminarUsuario(String numeroDeIdentificacion) {
		Iterator<Usuario> it = usuarios.iterator();
		while(it.hasNext()) {
			if(it.next().getNumeroDeIdentificacion().equals(numeroDeIdentificacion)) {
				it.remove();
				return;
			}
		}
	}
	
	public void prestarLibro(Usuario usuario, Libro libro) {
		if(libro.isDisponible()) {
			usuario.getLibrosPrestados().add(libro);
			libro.setDisponible(false);
		} else {
			System.out.println("El libro no esta disponible para prestamo.");
		}
	}
	
	public Usuario buscarUsuarioPorId(String id) {
		for (Usuario usuario : usuarios) {
			if(usuario.getNumeroDeIdentificacion().equals(id)) {
				return usuario;
			}
		}
		return null;
	}
	
	public void devolverLibro(Usuario usuario, Libro libro) {
		if(usuario.getLibrosPrestados().contains(libro)) {
			usuario.getLibrosPrestados().remove(libro);
			libro.setDisponible(true);
		} else {
			System.out.println("Este libro no fue prestado por este usuario.");
		}
	}
	
	public ArrayList<Libro> obtenerLibrosPrestados(Usuario usuario){
		return usuario.getLibrosPrestados();
	}
}
