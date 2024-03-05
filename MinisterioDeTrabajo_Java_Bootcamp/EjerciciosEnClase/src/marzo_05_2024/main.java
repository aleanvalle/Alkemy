package marzo_05_2024;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String[] planets = new String[8];
		fillArray(planets);
		showArray(planets);
	}
	
	private static void fillArray(String[] planets) {
		Scanner scan = new Scanner(System.in);
		String planet;
		for(int i = 0; i < planets.length; i++) {
			System.out.println("Input a planet: ");
			planet = scan.next();
			planets[i] = planet;
		}
		scan.close();
		return;
	}

	private static void showArray(String[] planets) {
		for(int i = 0; i < planets.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			if(i > 0 && i < planets.length) {
				System.out.print(", ");
			}
			System.out.print(planets[i]);
		}
		System.out.print("]");
		return;
	}

	

}
