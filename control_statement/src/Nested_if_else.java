

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			int age = scanner.nextInt();

			// Nested if...else Statement
			if (age > 18) {

				if (age < 150)

					System.out.println("Aligible for Vote");

				else

					System.out.println("Age not Valid");
			} else

				System.out.println("Not Aligible for Vote");
		}

	}

}
