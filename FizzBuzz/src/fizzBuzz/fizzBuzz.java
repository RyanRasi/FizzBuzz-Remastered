package fizzBuzz;

public class fizzBuzz {
	
	static menu menuPage = new menu();
		
	public static void fizzBuzz(int fizz, int buzz) {
			
		for (int i = 1; i <= 100; i++) {
	
		String output = "";
			
		if (i % fizz == 0) {
			output += "fizz";
		}
		if (i % buzz == 0) {
			output += "buzz";
		}
		if (output.equals("")) {
			output += i;
		}
		
		System.out.println(output);
		
		}
		menuPage.menuPage();
	}




}
