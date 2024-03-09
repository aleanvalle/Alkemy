package working_time_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println(
					"\nMenu de Opciones: " +
					"\n1) Crear Cuenta" +
					"\n2) Ingresar Saldo" +
					"\n3) Retirar Saldo" +
					"\n4) Consultar Saldo" +
					"\n5) Consultar Datos de Cuenta" +
					"\n0) Salir" +
					"\n\nSeleccione una opcion: ");
			opcion = scan.nextInt();
			switch(opcion) {
			case 1:
				cuenta = cuenta.crearCuenta();
				break;
			case 2:
				System.out.println("Ingrese cantidad de dinero a ingresar: ");
				double ingreso = scan.nextDouble();
				cuenta.ingresar(ingreso);
				break;
			case 3:
				System.out.println("Ingrese cantidad de dinero a retirar: ");
				double retiro = scan.nextDouble();
				cuenta.retirar(retiro);
				break;
			case 4:
				System.out.println("La cantidad de saldo disponible es: " + cuenta.consultarSaldo());
				break;
			case 5:
				cuenta.consultarDatos();
				break;
			case 0:
				System.out.println("Que tenga un buen dia!");
				break;
			default:
				System.out.println("Opcion incorrecta. Reingrese una opcion valida.");
			}
		} while(opcion != 0);
		scan.close();
	}
}
