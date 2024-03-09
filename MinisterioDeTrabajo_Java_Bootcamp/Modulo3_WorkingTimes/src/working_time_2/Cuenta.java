package working_time_2;

import java.util.Scanner;

public class Cuenta {
	int numeroCuenta;
	long dni;
	double saldoActual;
	
	public Cuenta() {}

	public Cuenta(int numeroCuenta, long dni, double saldoActual) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldoActual = saldoActual;
	}
	
	public Cuenta crearCuenta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese Numero de cuenta: ");
		int numeroCuenta = scan.nextInt();
		System.out.println("Ingrese DNI: ");
		long dni = scan.nextLong();
		System.out.println("Ingrese Saldo: ");
		double saldoActual = scan.nextDouble();
		return new Cuenta(numeroCuenta, dni, saldoActual);
	}
	
	public void ingresar(double ingreso) {
		saldoActual += ingreso;
	}
	
	public void retirar(double retiro) {
		if(retiro > saldoActual) {
			saldoActual = 0;
			System.out.println("Saldo excedido. Se retiro todo el saldo disponible.");
		}
		else {
			saldoActual -= retiro;
		}
	}
	
	public double consultarSaldo() {
		return saldoActual;
	}
	
	public void consultarDatos() {
		System.out.println(
				"Numero de Cuenta: " + numeroCuenta +
				"\nDNI: " + dni +
				"\nSaldo Actual: " + consultarSaldo());
	}
}
