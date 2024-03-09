package working_time_1;

public class Main {

	public static void main(String[] args) {
		Libro libro = new Libro();
		
		libro = libro.cargarLibro();

		System.out.println(libro.toString());
	}

}
