package quince_febrero_2024;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner number1_scan = new Scanner(System.in);
		Scanner number2_scan = new Scanner(System.in);
		Scanner number3_scan = new Scanner(System.in);
		Scanner number4_scan = new Scanner(System.in);
		Scanner string1_scan = new Scanner(System.in);
		Scanner string2_scan = new Scanner(System.in);
		Scanner number5_scan = new Scanner(System.in);
		Scanner number6_scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = number1_scan.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = number2_scan.nextInt();
		System.out.println("Enter the third number: ");
		int number3 = number3_scan.nextInt();
		System.out.println("Enter the fourth number: ");
		int number4 = number4_scan.nextInt();
		System.out.println("Enter the first phrase: ");
		String string1 = string1_scan.next();
		System.out.println("Enter the second phrase: ");
		String string2 = string2_scan.next();
		System.out.println("Enter the fifth number: ");
		int number5 = number5_scan.nextInt();
		System.out.println("Enter the sixth number: ");
		int number6 = number6_scan.nextInt();
		System.out.println(
				"The sum is: " + sum(number1, number2) + "\n"
				+ "The multiplication is: " + multiplication(number3, number4) + "\n"
				+ "The phrase is: " + concat(string1, string2) + "\n"
				+ "The comparation is: " + comparator(number5, number6));
	}

	static int sum(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static int multiplication(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	static String concat(String a, String b) {
		return a + b;
	}
	
	static boolean comparator(int a, int b) {
		return a == b;
	}
}
