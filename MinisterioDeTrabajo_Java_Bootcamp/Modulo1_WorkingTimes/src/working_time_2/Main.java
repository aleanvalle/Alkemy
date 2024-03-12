package working_time_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum = sum();
		String name = name();
		System.out.println("Result: " + sum);
		System.out.println("Result: " + name);
	}
	
	static int sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		System.out.println("Enter another number: ");
		int b = scan.nextInt();
		return a + b;
	}
	
	static String name() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String a = scan.next();
		return "¡Hola mundo! soy " + a + " y estoy programando en Java!";
	}

}
