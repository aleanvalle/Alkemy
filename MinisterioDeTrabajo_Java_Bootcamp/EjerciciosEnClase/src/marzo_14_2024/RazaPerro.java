package marzo_14_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaPerro {

	public static void main(String[] args) {
		int opcion;
		ArrayList<String> razasPerros = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		razasPerros.add("pekines");
		razasPerros.add("doberman");
		razasPerros.add("mastin napolitano");
		razasPerros.add("golden retriever");
		razasPerros.add("bulldog");
		do {
			System.out.println("Quiere guardar una raza?");
			System.out.println("1) Si");
			System.out.println("2) Salir");
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Ingrese una raza de perro: ");
				String raza = scan.nextLine();
				Iterator<String> it = razasPerros.iterator();
				boolean esNuevaRaza = false;
				while (it.hasNext()) {
					if(it.next().equals(raza)) {
						esNuevaRaza = false;
						it.remove();
						break;
					}
					esNuevaRaza = true;
				}
				if(!esNuevaRaza) {
					System.out.println("No es nueva raza, eliminada de la lista.");
					for(String razaPerro : razasPerros) {
						System.out.println("[" + razaPerro + "]");
					}
				}
				else {
					razasPerros.add(raza);
					System.out.println("Es nueva raza, agregada a la lista.");
					for(String razaPerro : razasPerros) {
						System.out.println("[" + razaPerro + "]");
					}
					System.out.println("\n");
				}
				break;
			case 2:
				System.out.println("Buen dia! Esta es la lista de razas: ");
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
