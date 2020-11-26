

public class Throws {

	public static void main(String[] args) {

		try {

			occurence();

		} catch (Exception e) {

			System.out.println("Exception Catch Successfully...");

		}

		/*
		 * In java Use throws instead of try...catch block
		 */
	}

	public static void occurence() throws IndexOutOfBoundsException {

		throw new IndexOutOfBoundsException("Index Out of Bounds Exception in Method");

	}

}
