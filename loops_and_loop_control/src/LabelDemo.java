

public class LabelDemo {

	public static void main(String[] args) {

		forLoop: for (int i = 0; i < 10; i++) {

			if (i == 5) {

				continue forLoop; // Continue with Labels

			}

			System.out.println(i);
		}

		task: for (int i = 0; i < 10; i++) {

			if (i == 5) {

				break task; // Break with Labels

			}

			System.out.println(i);
		}
	}
}
