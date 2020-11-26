

public class FinallyBlock_with_Throw {

	// throw used for throw exception in one place to other place

	// finally : always execute block (Use for Closing file and Connection)

	public static void main(String[] args) {

		ThrowTest throwTest = new ThrowTest();

		try {

			throwTest.ArrayBounce();

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index out of bounce Exception");

			throw e;

		} finally {

			System.out.println("Program completed");

		}

	}

}

class ThrowTest {

	int b[] = new int[5];

	void ArrayBounce() {

		try {

			System.out.println(b[66]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array Index Out of Bounds Exception");

		}

	}

}
