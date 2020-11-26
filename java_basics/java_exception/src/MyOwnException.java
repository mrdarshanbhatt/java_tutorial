

public class MyOwnException {

	public static void main(String[] args) {

		int age = 12;

		try {

			throw new MyException(age);

		} catch (MyException e) {

			System.out.println(e);

		}

	}

}

class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	MyException(int age) {

		if (age < 18) {

			System.out.print("You are not Eligible for vote...");

		} else {

			System.out.println("Thank you for Voting...");
		}

	}

}
