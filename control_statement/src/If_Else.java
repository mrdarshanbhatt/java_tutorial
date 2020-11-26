

public class If_Else {

	public static void main(String[] args) {

		int control = 22;
		double test = 22.22;

		// if...else
		if (control > test)

			System.out.println("Control is Bigger");

		else

			System.out.println("test is Bigger");

		// instead of if...else use Ternary Operator in java
		String result = control < test ? "Control is Bigger" : "test is Bigger";

		System.out.println(result);

	}

}
