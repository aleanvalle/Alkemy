package febrero_27_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		extractFourthAndFifthLetter(scan);
		showVowels_NoSwitch(scan);
		showVowels(scan);
		firstLetterIsA(scan);
		scan.close();
	}

	private static void extractFourthAndFifthLetter(Scanner scan) {
		System.out.println("*extractFourthAndFifthLetter*\nEnter a word: ");
		String string1 = scan.nextLine();
		while(string1.length() < 5) 
		{
			System.out.println("Error. Enter a word with 5 o more letters: ");
			string1 = scan.nextLine();
		}
		System.out.println("Fourth Letter: " + string1.substring(3).charAt(0) + "\nFifth Letter: " + string1.substring(4).charAt(0));
	}

	private static void showVowels_NoSwitch(Scanner scan) {
		int counter = 0;
		int j = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		List<Character> distinctVowels = new ArrayList<Character>();
		System.out.println("*showVowels_NoSwitch*\nEnter a word: ");
		String string2 = scan.nextLine().toLowerCase();
		while(j < string2.length()) {
			for(int i = 0; i < vowels.length; i++) 
			{
				if(vowels[i] == string2.charAt(j))
				{
					counter++;
					if(!distinctVowels.contains(string2.charAt(j))) 
					{
						distinctVowels.add(string2.charAt(j));
					}
				}
			}
			j++;
		}
		System.out.println("The word has " + counter + " vowels. Unique are " + distinctVowels.size());
	}
	
	private static void showVowels(Scanner scan) {
		int counter = 0;
		System.out.println("*showVowels*\nEnter a word: ");
		String string3 = scan.nextLine().toLowerCase();
		for(int i = 0; i < string3.length(); i++) {
			switch (string3.charAt(i)) {
			case 'a':
				counter++;
				break;
			case 'e':
				counter++;
				break;
			case 'i':
				counter++;
				break;
			case 'o':
				counter++;
				break;
			case 'u':
				counter++;
				break;
			default:
				break;
			}
		}
		System.out.println("The word has " + counter + " vowels.");
	}
	
	private static void firstLetterIsA(Scanner scan) {
		System.out.println("*firstLetterIsA*\nEnter a phrase or word: ");
		String phraseOrWord = scan.nextLine().toLowerCase();
		if(phraseOrWord.charAt(0) == 'a') {
			System.out.println("CORRECTO");
		}
		else {
			System.out.println("INCORRECTO");
		}
	}
}
