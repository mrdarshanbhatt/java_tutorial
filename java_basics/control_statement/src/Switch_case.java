

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			switch (scanner.next()) {

			case "car":

				System.out.println("Car is running");
				break;

			case "truck":

				System.out.println("Truck is running");
				break;

			case "bike":

				System.out.println("Bike is running");
				break;

			default:

				System.out.println("No any Vehicles");
				break;
			}
		}
	}
}
