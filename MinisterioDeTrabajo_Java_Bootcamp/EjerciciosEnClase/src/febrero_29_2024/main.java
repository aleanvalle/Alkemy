package febrero_29_2024;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		showBiggestNumber(scan);
		showPositionsOfNumber(scan);
		scan.close();
	}
	
	private static void showBiggestNumber(Scanner scan) {
		int[] numbers = new int[3];
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the number in position " + i + ": ");
			numbers[i] = scan.nextInt();
		}
		int biggestNumber = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > biggestNumber) {
				biggestNumber = numbers[i];
			}
		}
		System.out.println("The biggest number is: " + biggestNumber);
	}
	
	private static void showPositionsOfNumber(Scanner scan) {
		System.out.println("Enter the length of the array: ");
		int arrayLength = scan.nextInt();
		int[] numbers = new int[arrayLength];
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the number in position " + i + ": ");
			numbers[i] = scan.nextInt();
		}
		System.out.println("Enter the number to search inside the array: ");
		int numberToSearch = scan.nextInt();
		boolean numberNotFound = true;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == numberToSearch) {
				numberNotFound = false;
				System.out.println("The number was found on position: " + i);
			}
		}
		if(numberNotFound) {
			System.out.println("The number was not found");
		}
	}
	
	
	
	
	

}
