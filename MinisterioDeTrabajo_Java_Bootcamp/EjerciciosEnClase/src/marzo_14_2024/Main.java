package marzo_14_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno mario = new Alumno("Mario", 3, 7, 10);
		Alumno jose = new Alumno("Jose", 5, 5, 5);
		Alumno matias = new Alumno("Matias", 7, 7, 7);
		Alumno monica = new Alumno("Monica", 2, 10, 10);
		Alumno micaela = new Alumno("Micaela", 5, 5, 10);
		alumnos.add(mario);
		alumnos.add(jose);
		alumnos.add(matias);
		alumnos.add(monica);
		alumnos.add(micaela);
		System.out.println("Ingrese el nombre del alumno a buscar: ");
		String nombreBuscado = scan.nextLine();
		boolean alumnoNoEncontrado = true;
		for(Alumno alumno : alumnos) {
			if(alumno.getNombre().equals(nombreBuscado)) {
				System.out.println("La nota final del alumno es: " + alumno.notaFinal());
				alumnoNoEncontrado = false;
				break;
			}
		}
		if(alumnoNoEncontrado) {
			System.out.println("El alumno no fue encontrado.");
		}
		scan.close();
	}

}
