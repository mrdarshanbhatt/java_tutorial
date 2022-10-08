

public class ForLoop {

	public static void main(String[] args) {

		// For loop
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
		}

		// for loop also use in this type
		int j = 0;
		for (; j < 10;) {
			System.out.println("j : " + j);
			j++;
		}

		// Infinite for loop
		for (;;) {
			System.out.println("Infinite");
		}
		
		//for inside for loop
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
			System.out.println("i : " + i + " j : " + j);
		}
		}
	}

}
