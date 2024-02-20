package veinte_febrero_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner number_scan = new Scanner(System.in);
		Scanner evenOrOdd_scan = new Scanner(System.in);
		Scanner monthNoSwitch_scan = new Scanner(System.in);
		Scanner month_scan = new Scanner(System.in);
		Scanner character_scan = new Scanner(System.in);
		numberIsPositiveOrNegative(number_scan);
		numberIsEvenOrOdd(evenOrOdd_scan);
		isMonthAndSeason_NoSwitch(monthNoSwitch_scan);
		isMonthAndSeason(month_scan);
		is_S_Or_N_Character(character_scan);
		number_scan.close();
		evenOrOdd_scan.close();
		monthNoSwitch_scan.close();
		month_scan.close();
		character_scan.close();
	}

	private static void numberIsPositiveOrNegative(Scanner number_scan) {
		System.out.println("*numberIsPositiveOrNegative*\nEnter a number: ");
		int number = number_scan.nextInt();
		if(number >= 0) {
			System.out.println("Number is positive.");
		}
		else {
			System.out.println("Number is negative.");
		}
	}
	
	private static void numberIsEvenOrOdd(Scanner evenOrOdd_scan) {
		System.out.println("*numberIsEvenOrOdd*\nEnter a number: ");
		int evenOrOdd = evenOrOdd_scan.nextInt();
		if(evenOrOdd == 0) 
		{
			System.out.println("Number is zero.");
		}
		else if(evenOrOdd % 2 == 0)
		{
			System.out.println("Number is even.");
		}
		else
		{
			System.out.println("Number is odd.");
		}
	}
	
	private static void isMonthAndSeason_NoSwitch(Scanner monthNoSwitch_scan) {
		Map<Integer, ArrayList<String>> seasonByMonth = new HashMap<Integer, ArrayList<String>>()
		{{
			put(1, new ArrayList<String>()
			{{
				add("Enero"); 
				add("Verano");
			}});
			put(2, new ArrayList<String>()
			{{
				add("Febrero"); 
				add("Verano");
			}});
			put(3, new ArrayList<String>()
			{{
				add("Marzo"); 
				add("Verano u Otonio");
			}});
			put(4, new ArrayList<String>()
			{{
				add("Abril"); 
				add("Otonio");
			}});
			put(5, new ArrayList<String>()
			{{
				add("Mayo"); 
				add("Otonio");
			}});
			put(6, new ArrayList<String>()
			{{
				add("Junio"); 
				add("Otonio o Invierno");
			}});
			put(7, new ArrayList<String>()
			{{
				add("Julio"); 
				add("Invierno");
			}});
			put(8, new ArrayList<String>()
			{{
				add("Agosto"); 
				add("Invierno");
			}});
			put(9, new ArrayList<String>()
			{{
				add("Septiembre"); 
				add("Invierno o Primavera");
			}});
			put(10, new ArrayList<String>()
			{{
				add("Octubre"); 
				add("Primavera");
			}});
			put(11, new ArrayList<String>()
			{{
				add("Noviembre"); 
				add("Primavera");
			}});
			put(12, new ArrayList<String>()
			{{
				add("Diciembre"); 
				add("Primavera o Verano");
			}});
		}};
		System.out.println("*isMonthAndSeason_NoSwitch*\nEnter a month: ");
		int month = monthNoSwitch_scan.nextInt();
		System.out.println("Es " + seasonByMonth.get(month).get(0) + " y es " + seasonByMonth.get(month).get(1)); 
	}
	
	private static void isMonthAndSeason(Scanner month_scan) {
		System.out.println("*isMonthAndSeason*\nEnter a month: ");
		int month = month_scan.nextInt();
		switch (month) {
		case 1:
			System.out.println("Es enero y estamos en Verano");
			break;
		case 2:
			System.out.println("Es febrero y estamos en Verano");
			break;
		case 3:
			System.out.println("Es marzo y estamos en Verano u Otonio");
			break;
		case 4:
			System.out.println("Es abril y estamos en Otonio");
			break;
		case 5:
			System.out.println("Es mayo y estamos en Otonio");
			break;
		case 6:
			System.out.println("Es junio y estamos en Otonio o Invierno");
			break;
		case 7:
			System.out.println("Es julio y estamos en Invierno");
			break;
		case 8:
			System.out.println("Es agosto y estamos en Invierno");
			break;
		case 9:
			System.out.println("Es septiembre y estamos en Invierno o Primavera");
			break;
		case 10:
			System.out.println("Es octubre y estamos en Primavera");
			break;
		case 11:
			System.out.println("Es noviembre y estamos en Primavera");
			break;
		default:
			System.out.println("Es diciembre y estamos en Primavera o Verano");
		}
	}
	
	private static void is_S_Or_N_Character(Scanner character_scan) {
		System.out.println("*is_S_Or_N_Character*\nEnter a character: ");
		char s_Or_N = character_scan.next().charAt(0);
		if(s_Or_N == 'N' || s_Or_N == 'S') {
			System.out.println("CORRECTO");
		}
		else {
			System.out.println("INCORRECTO");
		}
	}
	

}
