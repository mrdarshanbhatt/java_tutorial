


public class ExceptionFactory {

	public static void NumberException() {

		String exceptionString = "Exception Factory";

		try {

			System.out.println((int) Integer.parseInt(exceptionString));

		} catch (NumberFormatException e) {

			System.out.println("Number Format Exception...");

		}

	}

	public static void MathError() {

		try {

			System.out.println(50 / 0);

		} catch (ArithmeticException e) {

			System.out.println("Aerithmetic Exception...");

		}
	}

	public static void ArrayBounceError() {

		int intArray[] = new int[5];

		try {

			System.out.println(intArray[6]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index out of bounds Exception...");

		}

	}

	public static void indexException() {

		String exceptionString = "Index Exception";

		try {

			System.out.println(exceptionString.charAt(55));

		} catch (IndexOutOfBoundsException e) {

			System.out.println("index out of bounds Exception...");

		}

	}

	public static void main(String[] args) {

		NumberException();

		MathError();

		ArrayBounceError();

		indexException();

	}

}
