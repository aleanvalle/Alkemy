package febrero_22_2024;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("*Sum with For*\n");
		System.out.println("Result:" + sum_for() + "\n");
		System.out.println("*Sum with while*\n");
		System.out.println("Result:" + while_loop() + "\n");
		System.out.println("*Sum with do-while*\n");
		System.out.println("Result:" + do_while_loop());
	}
	
	public static int sum_for() 
	{
		int sum = 0;
		for(int i = 1; i < 11; i++) 
		{
			sum += i;
			System.out.println("Sum: " + sum + " Counter: " + i);
		}
		return sum;
	}

	public static int while_loop() 
	{
		int counter = 1;
		int sum = 0;
		while(counter < 11) 
		{
			sum += counter;
			System.out.println("Sum: " + sum + " Counter: " + counter);
			counter++;
		}
		return sum;
	}
	
	public static int do_while_loop() 
	{
		int counter = 1;
		int sum = 0;
		do 
		{
			sum += counter;
			System.out.println("Sum: " + sum + " Counter: " + counter);
			counter++;
		}while(counter < 11);
		return sum;
	}
	
}
