package marzo_14_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaPerro {

	public static void main(String[] args) {
		int opcion;
		ArrayList<String> razasPerros = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una raza de perro: ");
		String raza = scan.nextLine();
		razasPerros.add(raza);
		do {
			System.out.println("Quiere guardar otra raza?");
			System.out.println("1) Si");
			System.out.println("2) Salir");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese una raza de perro: ");
				raza = scan.nextLine();
				Iterator<String> it = razasPerros.iterator();
				boolean esNuevaRaza = false;
				while (it.hasNext()) {
					if(it.next().equals(raza)) {
						it.remove();
					}
					else {
						razasPerros.add(raza);
						esNuevaRaza = true;
					}
				}
				if(!esNuevaRaza) {
					for(String razaPerro : razasPerros) {
						System.out.println("[" + razaPerro + "]");
					}
				}
				else {
					System.out.println("Es nueva raza, agregada a la lista.");
					for(String razaPerro : razasPerros) {
						System.out.println("[" + razaPerro + "]");
					}
					System.out.println("\n");
				}
				break;
			case 2:
				for(String razaPerro : razasPerros) {
					System.out.println("[" + razaPerro + "]");
				}
				break;
			default:
				System.out.println("Selecciona una opcion valida.");
				break;
			}
		}while(opcion != 2);
		scan.close();
	}

}
