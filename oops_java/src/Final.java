

/* Final means 
		Variable Not Changeable , 
		Method not Overriding
		Class not Extends
*/
public class Final extends FinalClass { // Here occurs Exception
										// not sub-class as final

	public void finalMethod() { // Can't override final method

		System.out.println("Final Method in Main");
	}

	public static void main(String[] args) {

		final int finalVar = 22;
		finalVar = 23; // here Generate Exception

	}
}

final class FinalClass {

	public final void finalMethod() {

		System.out.println("Call FinalMethod");

	}

}
