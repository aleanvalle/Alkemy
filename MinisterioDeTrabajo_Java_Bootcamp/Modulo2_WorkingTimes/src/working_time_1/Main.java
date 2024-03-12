package working_time_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number1 = numberBetweenZeroAndNinetyNine();
		int number2 = (int) (Math.random() * 100);
		int result = number1 + number2;
		String phrase = calmOrLoudPhrase();
		System.out.println(
				"First number: " + number1 + "\n"
				+ "Second Number: " + number2 + "\n"
				+ "Result: " + result);
		System.out.println("Your phrase is: " + phrase);
	}
	
	static int numberBetweenZeroAndNinetyNine() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 99: ");
		int number = scan.nextInt();
		while(number < 0 || number > 99) {
			System.out.println("Error. Input a number between 0 and 99: ");
			number = scan.nextInt();
		}
		return number;
	}
	
	static String calmOrLoudPhrase() {
		Scanner phraseScan = new Scanner(System.in);
		Scanner preferenceScan = new Scanner(System.in);
		System.out.println("Write a phrase: ");
		String phrase = phraseScan.next();
		System.out.println("Input a preference: LOUD or calm: ");
		String preference = preferenceScan.next();
		while(!preference.equals("LOUD") && !preference.equals("calm")) {
			System.out.println("Error. Enter: LOUD or calm: ");
			preference = preferenceScan.next();
		}
		if(preference.equals("LOUD")) {
			return phrase.toUpperCase();
		}
		else {
			return phrase.toLowerCase();
		}
	}

}
