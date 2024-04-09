package com.miapp.biblioteca.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.miapp.biblioteca.Libro;
import com.miapp.biblioteca.Usuario;
import com.miapp.biblioteca.service.LibroServicio;
import com.miapp.biblioteca.service.UsuarioServicio;

public class Main {

	public static void main(String[] args) {
		Usuario cosme = new Usuario("Cosme Fulanito", "22");
		Usuario mario = new Usuario("Mario", "01");
		Usuario homeroElBueno = new Usuario("Homero bueno", "777");
		
		ArrayList<Libro> biblioteca = new ArrayList<>();
		ArrayList<Usuario> usuarios = new ArrayList<>();
		LibroServicio bookService = new LibroServicio(biblioteca);
		UsuarioServicio userService = new UsuarioServicio(usuarios);
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("*-*-* Biblioteca Virtual *-*-*");
			System.out.println("1. Crear Libro");
			System.out.println("2. Actualizar Libro");
			System.out.println("3. Buscar Libro por ISBN");
			System.out.println("4. Buscar Libros por titulo");
			System.out.println("5. Listar Libros");
			System.out.println("6. Eliminar Libro");
			System.out.println("7. Prestamos");
			System.out.println("8. Devoluciones");
			System.out.println("9. Salir");
			System.out.println("--- Seleccione una opcion ---");
			opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el titulo: ");
				String titulo = scanner.nextLine();
				System.out.println("Ingrese el autor: ");
				String autor = scanner.nextLine();
				System.out.println("Ingrese el isbn: ");
				String isbn = scanner.nextLine();
				System.out.println("Ingrese el genero: ");
				String genero = scanner.nextLine();
				bookService.crearLibro(autor, genero, isbn, titulo);
				break;
			case 2:
				System.out.println("Ingrese el ISBN del libro a actualizar: ");
				String isbnAActualizar = scanner.nextLine();
				System.out.println("Ingrese el nuevo autor: ");
				String nuevoAutor = scanner.nextLine();
				System.out.println("Ingrese el nuevo genero: ");
				String nuevoGenero = scanner.nextLine();
				System.out.println("Ingrese el nuevo titulo: ");
				String nuevoTitulo = scanner.nextLine();
				bookService.actualizarLibro(isbnAActualizar, nuevoAutor, nuevoGenero, nuevoTitulo);
				break;
			case 3:
				System.out.println("Ingrese el ISBN del libro a buscar: ");
				String isbnABuscar = scanner.nextLine();
				Libro posibleLibro = bookService.buscarLibroPorISBN(isbnABuscar);
				if(posibleLibro != null) {
					System.out.println("Libro encontrado: " + posibleLibro.getTitulo());
				} else {
					System.out.println("Libro no encontrado.");
				}
				break;
			case 4:
				System.out.println("Ingrese titulo a buscar: ");
				String tituloABuscar = scanner.nextLine();
				ArrayList<Libro> librosPorTitulo = bookService.buscarLibrosPorTitulo(tituloABuscar);
				if(!librosPorTitulo.isEmpty()) {
					System.out.println("Libros Encontrados: ");
					for(Libro libro : librosPorTitulo) {
						System.out.println(libro.getTitulo());
					}
				} else {
					System.out.println("Ningun libro fue encontrado con ese titulo.");
				}
				break;
			case 5:
				ArrayList<Libro> listaDeLibros = bookService.obtenerTodosLosLibros();
				for(Libro libro : listaDeLibros) {
					System.out.println(libro.getTitulo() + " (" + libro.getIsbn() + ")");
				}
				break;
			case 6:
				System.out.println("Ingrese el ISBN del libro a eliminar: ");
				String isbnAEliminar = scanner.nextLine();
				bookService.eliminarLibro(isbnAEliminar);
				break;
			case 7:
				System.out.println("Ingrese el numero de identificacion del usuario: ");
				String numeroDeIdentificacionDelUsuarioPrestamo = scanner.nextLine();
				Usuario posibleUsuarioPrestamo = userService.buscarUsuarioPorId(numeroDeIdentificacionDelUsuarioPrestamo);
				if(posibleUsuarioPrestamo != null) {
					System.out.println("Ingrese el ISBN del libro a prestar: ");
					String isbnPrestamo = scanner.nextLine();
					Libro posibleLibroPrestamo = bookService.buscarLibroPorISBN(isbnPrestamo);
					if(posibleLibroPrestamo != null) {
						if(bookService.verificarDisponibilidad(posibleLibroPrestamo)) {
							userService.prestarLibro(posibleUsuarioPrestamo, posibleLibroPrestamo);
							System.out.println("Prestamo exitoso. Libro prestado a " + posibleUsuarioPrestamo.getNombre());
						} else {
							System.out.println("El libro no esta disponible para prestamo.");
						}
					} else {
						System.out.println("Libro no encontrado.");
					}
				} else {
					System.out.println("Usuario no encontrado.");
				}
				break;
			case 8:
				System.out.println("Ingrese el numero de identificacion del usuario: ");
				String numeroDeIdentificacionDelUsuarioDevolucion = scanner.nextLine();
				Usuario posibleUsuarioDevolucion = userService.buscarUsuarioPorId(numeroDeIdentificacionDelUsuarioDevolucion);
				if(posibleUsuarioDevolucion != null) {
					System.out.println("Ingrese el ISBN del libro a devolver: ");
					String isbnDevolucion = scanner.nextLine();
					Libro posibleLibroDevolucion = bookService.buscarLibroPorISBN(isbnDevolucion);
					if(posibleLibroDevolucion != null) {
						userService.devolverLibro(posibleUsuarioDevolucion, posibleLibroDevolucion);
						System.out.println("Devolucion exitosa. Libro devuelto por " + posibleUsuarioDevolucion.getNombre());
					} else {
						System.out.println("Libro no encontrado.");
					}
				} else {
					System.out.println("Usuario no encontrado.");
				}
				break;
			case 9:
				System.out.println("Gracias por usar la -*-*- Biblioteca Virtual -*-*- ¡Nos vemos!");
				break;
			default:
				System.out.println("Opcion invalida, reintente.");
			}
		}while(opcion != 9);
	}

}
