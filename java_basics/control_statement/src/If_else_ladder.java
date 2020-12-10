

import java.util.Scanner;

public class If_else_ladder {

	public static void main(String[] args) {

		// if-else-if ladder Statement
		try (Scanner scanner = new Scanner(System.in)) {
	
			long grade = scanner.nextLong();
 
			if (grade >= 90)
			
				System.out.println("A++");
			
			else if (grade > 80 && grade < 90)
				
				System.out.println("A");
			
			else if (grade > 50 && grade < 80)
				
				System.out.println("B++");
			
			else if (grade > 35 && grade < 50)
				
				System.out.println("B");
			
			else
				
				System.out.println("Fail");
	
		}
	
	}
}
