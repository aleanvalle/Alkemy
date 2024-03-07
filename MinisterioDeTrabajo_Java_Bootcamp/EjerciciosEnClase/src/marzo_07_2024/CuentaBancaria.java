package marzo_07_2024;

public class CuentaBancaria {
	int numeroCuenta;
	int dni;
	String titular;
	double saldo;
	
	public CuentaBancaria() {}

	public CuentaBancaria(int numeroCuenta, int dni, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void showData() {
		System.out.println(
				"Numero de Cuenta: " + numeroCuenta + 
				"\nDni: " + dni +
				"\nTitular: " + titular +
				"\nSaldo: " + saldo);
		return;
	}
	
	public void cargarSaldo(double saldo) {
		this.saldo += saldo;
	}
}
