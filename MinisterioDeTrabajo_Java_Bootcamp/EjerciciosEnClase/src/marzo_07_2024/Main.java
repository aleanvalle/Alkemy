package marzo_07_2024;

public class Main {

	public static void main(String[] args) {
		int accountNumber = 26502657;
		int dni = 2222222;
		String holder = "Martin";
		double balance = 206485;
		CuentaBancaria account1 = new CuentaBancaria(accountNumber, dni, holder, balance);
		account1.showData();
		System.out.println("*****");
		account1.cargarSaldo(93515.420);
		account1.showData();
	}

}
