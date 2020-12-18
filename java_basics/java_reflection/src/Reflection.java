import javax.xml.ws.soap.Addressing;

/*
 * 3 Way to Create Instance of Class in java
*/
public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException {

		// Using Class.forName()
		usingClassForName();

		// Using ClassName.class
		usingDotClass();

		// Using object.getClass()
		usingGetClass();

		// Check Class or Interface
		checkClassAndInterface();
	}

	public static void usingClassForName() throws ClassNotFoundException {
		System.out.println(Class.forName("TestClass").getName());
	}

	public static void usingDotClass() {
		System.out.println(TestClass.class.getName());
	}

	public static void usingGetClass() {
		Object object = new TestClass();
		System.out.println(object.getClass().getName());
	}

	public static void checkClassAndInterface() {
		System.out.println(TestClass.class.isInterface());
		System.out.println(TestInterface.class.isInterface());
	}

}

// Use for Testing
class TestClass {
}

interface TestInterface {
}
