

public class FireException {

	public static void main(String args[]) {
		try {

			/*
			 * Here occurs Parent Exception because in String occurs
			 * IndexOutOfBoundsException
			 */

			String exceptionString = "Java Exception";

			exceptionString.charAt(44);

			System.out.println(50 / 0);

		} catch (ArithmeticException e) {

			System.out.println("Arithmetic Exception");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBounds Exception");

		} catch (Exception e) {

			System.out.println("Parent Exception occurs");
		}

		System.out.println("Finally Executed....");

	}

}