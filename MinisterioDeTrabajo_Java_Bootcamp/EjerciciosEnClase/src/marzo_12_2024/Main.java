package marzo_12_2024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cafetera cafetera = new Cafetera(50, 25);
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println(
				"Ingrese una opcion: " +
				"\n1) Ver Capacidad de Cafetera" +
				"\n2) Llenar Cafetera" +
				"\n3) Servir Taza" +
				"\n4) Vaciar Cafetera" +
				"\n5) Agregar Cafe" +
				"\n6) Ver Cantidad de Cafe restante" +
				"\n7) Setear Cantidad Actual" +
				"\n8) Setear Capacidad Maxima" +
				"\n0) Salir");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("La capacidad maxima de esta cafetera es de: " + cafetera.getCapacidadMaxima() + " ml"); 
				break;
			case 2:
				cafetera.llenarCafetera(); 
				break;
			case 3:
				System.out.println("Ingrese una cantidad a servir: ");
				int cantidadAServir = scan.nextInt();
				cafetera.servirTaza(cantidadAServir); 
				break;
			case 4:
				cafetera.vaciarCafetera(); 
				break;
			case 5:
				System.out.println("Ingrese una cantidad a agregar: ");
				int cantidadAAgregar = scan.nextInt();
				cafetera.agregarCafe(cantidadAAgregar); 
				break;
			case 6:
				System.out.println("La cantidad de cafe restante es de: " + cafetera.getCantidadActual() + " ml"); 
				break;
			case 7:
				System.out.println("Ingrese una cantidad actual: ");
				int cantidadActual = scan.nextInt();
				cafetera.setCantidadActual(cantidadActual);
				break;
			case 8:
				System.out.println("Ingrese una capacidad maxima: "); 
				int capacidadMaxima = scan.nextInt();
				cafetera.setCapacidadMaxima(capacidadMaxima);
				break;
			case 0:
				System.out.println("Buen dia!");
				break;
			default:
				System.out.println("Error, ingrese una opcion valida.");
				break;
			}
		}while(opcion != 0);
		scan.close();
	}

}
