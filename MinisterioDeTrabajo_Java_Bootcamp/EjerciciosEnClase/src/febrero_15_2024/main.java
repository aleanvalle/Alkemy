package febrero_15_2024;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan_numbers = new Scanner(System.in);
		Scanner scan_strings = new Scanner(System.in);
		sum(scan_numbers);
		multiplication(scan_numbers);
		concat(scan_strings);
		comparator(scan_numbers);
		scan_numbers.close();
		scan_strings.close();
	}

	private static void sum(Scanner scan) {
		System.out.println("Enter the first number: ");
		int number1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = scan.nextInt();
		System.out.println("The sum is: " + (number1 + number2));
	}
	
	private static void multiplication(Scanner scan) {
		System.out.println("Enter the third number: ");
		int number3 = scan.nextInt();
		System.out.println("Enter the fourth number: ");
		int number4 = scan.nextInt();
		System.out.println("The multiplication is: " + (number3 * number4));
	}
	
	private static void concat(Scanner scan) {
		System.out.println("Enter the first phrase: ");
		String string1 = scan.nextLine();
		System.out.println("Enter the second phrase: ");
		String string2 = scan.nextLine();
		System.out.println("The phrase is: " + string1.concat(string2));
	}
	
	private static void comparator(Scanner scan) {
		System.out.println("Enter the fifth number: ");
		int number5 = scan.nextInt();
		System.out.println("Enter the sixth number: ");
		int number6 = scan.nextInt();
		System.out.println("The comparation is: " + (number5 == number6));
	}
}
