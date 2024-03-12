package working_time_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static final String POUND = "pound";
	static final String USD = "usd";
	static final String YEN = "yen";

	public static void main(String[] args) {
		Scanner euroScan = new Scanner(System.in);
		Scanner currencyScan = new Scanner(System.in);
		Scanner arraySizeScan = new Scanner(System.in);
		Scanner integerToSearchScan = new Scanner(System.in);
		System.out.println("***Have an idea?***");
		boolean haveAnIdea = haveAnIdea();
		if(haveAnIdea) {
			System.out.println("Correcto.");
		}
		else {
			System.out.println("Incorrecto.");
		}
		System.out.println("***Euro exchange!***");
		System.out.println("Input euro amount: ");
		int euroAmount = euroScan.nextInt();
		System.out.println("Input a currency (pound, usd or yen): ");
		String currency = currencyScan.next();
		while(isNotLimitedCurrency(currency.toLowerCase())) {
			System.out.println("Error. Input pound, usd or yen: ");
			currency = currencyScan.next();
		}
		euroExchange(euroAmount, currency.toLowerCase());
		System.out.println("***Exists?***");
		System.out.println("Input a size for an array: ");
		int arraySize = arraySizeScan.nextInt();
		System.out.println("Input a integer to search on the array: ");
		int integerToSearch = integerToSearchScan.nextInt();
		if(checkElementInVector(arraySize, integerToSearch)) {
			System.out.println("Encontrado.");
		}
		else {
			System.out.println("No Encontrado.");
		}
	}
	
	static boolean haveAnIdea() {
		Scanner ideaScan = new Scanner(System.in);
		System.out.println("Write a word: ");
		String idea = ideaScan.next();
		return idea.equals("eureka");
	}
	
	static boolean isNotLimitedCurrency(String currency) {
		return !currency.equals(POUND) && !currency.equals(USD) && !currency.equals(YEN);
	}
	
	static void euroExchange(int euroAmount, String poundUsdOrYen) {
		double euroToPound = 0.86;
		double euroToUsd = 1.28611;
		double euroToYen = 129.852;
		if(poundUsdOrYen.equals(POUND)) {
			System.out.println("The exchange is: " + (euroAmount * euroToPound) + " " + POUND);
		}
		else if(poundUsdOrYen.equals(USD)) {
			System.out.println("The exchange is: " + (euroAmount * euroToUsd) + " " + USD);
		}
		else if(poundUsdOrYen.equals(YEN)) {
			System.out.println("The exchange is: " + (euroAmount * euroToYen) + " " + YEN);
		}
	}
	
	static boolean checkElementInVector(int arraySize, int elementToSearch) {
		int[] array = new Random().ints(arraySize).toArray();
		return Arrays.asList(array).contains(elementToSearch);
	}

}
