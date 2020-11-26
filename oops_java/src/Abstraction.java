

// In java we Do not Create Object of Abstract Class
// if we want to Create Object then Extends class on Other class
public class Abstraction {

	public static void main(String[] args) {

		// If we want not Extends then use Anonymous type or Override Method
		AbstractTest abstractTest = new AbstractTest() {

			@Override
			public void getData() {

				System.out.println("Get Data Method Call");

			}
		};

		abstractTest.abstractMethod();

	}

}

// Abstract Class Contain Method Declaration and Also Contain Mthod with Body
// Achieve Abstraction (0 - 100 %)
abstract class AbstractTest {

	public void abstractMethod() {

		System.out.println("Abstarct Methos Call");

	}

	public abstract void getData(); // Abstract Method only Declaration

	// Also Contain Static Method
	public static void fetchData() {

		System.out.println("Static Method");

	}

	// Also Contain Final Method
	public final void fetchAllData() {

		System.out.println("Fetch All Data Method");

	}
}