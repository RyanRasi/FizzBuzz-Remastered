package fizzBuzz;

import java.util.Scanner;

public class menu {
		
		public void menuPage () {
			
		int fizz = 3;
		int buzz = 5;
		
		String stringmenuchoice = null;
		do {
	System.out.println("\nEnter play to play with default values of 3 and 5, choose to choose the values or exit to terminate.");
	@SuppressWarnings("resource")
	Scanner menu = new Scanner(System.in);
	stringmenuchoice = menu.next().toLowerCase();
		} while  (!stringmenuchoice.equals("play") && !stringmenuchoice.equals("choose") && !stringmenuchoice.equals("exit"));
		
		switch (stringmenuchoice) {
		case "play":
			fizzBuzz.fizzBuzz (3, 5);
			break;
		case "choose":
			String chooseChoice = null;

		System.out.println("\nEnter the multiple for fizz");
		@SuppressWarnings("resource")
		Scanner menu = new Scanner(System.in);
		chooseChoice = menu.next().toLowerCase();
		try {
			fizz = 0;
			fizz = Integer.parseInt(chooseChoice);
			 }catch(NumberFormatException e) {
			   System.out.println("input was not an int value"); 
			   // NumberFormatException
			 }
		
		String chooseChoice2 = null;

	System.out.println("\nEnter the multiple for fizz");
	@SuppressWarnings("resource")
	Scanner menu2 = new Scanner(System.in);
	chooseChoice2 = menu2.next().toLowerCase();
	try {
		buzz = 0;
		buzz = Integer.parseInt(chooseChoice2);
		 }catch(NumberFormatException e) {
		   System.out.println("input was not an int value"); 
		   // NumberFormatException
		 }
	fizzBuzz.fizzBuzz (fizz, buzz);
			break;
		case "exit":
			System.out.println("Application Terminated");
			System.exit(0);
			break;
		}
		}
		
	}


