package veintisiete_febrero_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner string1_scan = new Scanner(System.in);
		Scanner string2_scan = new Scanner(System.in);
		Scanner string3_scan = new Scanner(System.in);
		Scanner phraseOrWord_scan = new Scanner(System.in);
		extractFourthAndFifthLetter(string1_scan);
		showVowels_NoSwitch(string2_scan);
		showVowels(string3_scan);
		firstLetterIsA(phraseOrWord_scan);
		string1_scan.close();
		string2_scan.close();
		string3_scan.close();
		phraseOrWord_scan.close();
	}

	private static void extractFourthAndFifthLetter(Scanner string1_scan) {
		System.out.println("*extractFourthAndFifthLetter*\nEnter a word: ");
		String string1 = string1_scan.next();
		while(string1.length() < 5) 
		{
			System.out.println("Error. Enter a word with 5 o more letters: ");
			string1 = string1_scan.next();
		}
		System.out.println("Fourth Letter: " + string1.substring(3).charAt(0) + "\nFifth Letter: " + string1.substring(4).charAt(0));
	}

	private static void showVowels_NoSwitch(Scanner string2_scan) {
		int counter = 0;
		int j = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		List<Character> distinctVowels = new ArrayList<Character>();
		System.out.println("*showVowels_NoSwitch*\nEnter a word: ");
		String string2 = string2_scan.next().toLowerCase();
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
	
	private static void showVowels(Scanner string3_scan) {
		int counter = 0;
		System.out.println("*showVowels*\nEnter a word: ");
		String string3 = string3_scan.next().toLowerCase();
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
	
	private static void firstLetterIsA(Scanner phraseOrWord_scan) {
		System.out.println("*firstLetterIsA*\nEnter a phrase or word: ");
		String phraseOrWord = phraseOrWord_scan.nextLine().toLowerCase();
		if(phraseOrWord.charAt(0) == 'a') {
			System.out.println("CORRECTO");
		}
		else {
			System.out.println("INCORRECTO");
		}
	}
}
