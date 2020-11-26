

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 9)
				continue;  // Again Control pass to loop
			System.out.println(i);
		}
	}
}
