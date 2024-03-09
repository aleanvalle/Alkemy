package working_time_1;

import java.util.Scanner;

public class Libro {
	int isbn;
	String titulo;
	String autor;
	int numeroDePaginas;
	
	public Libro() {}

	public Libro(int isbn, String titulo, String autor, int numeroDePaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@Override
	public String toString() {
		return "ISBN: " + isbn + 
				"\nTitulo: " + titulo +
				"\nAutor: " + autor +
				"\nNumero de Paginas: " + numeroDePaginas;
	}
	
	public Libro cargarLibro() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese ISBN: ");
		int isbn = scan.nextInt();
		System.out.println("Ingrese Titulo: ");
		String titulo = scan.next();
		System.out.println("Ingrese Autor: ");
		String autor = scan.next();
		System.out.println("Ingrese Numero de Paginas: ");
		int numeroDePaginas = scan.nextInt();
		scan.close();
		return new Libro(isbn, titulo, autor, numeroDePaginas);
	}
}
