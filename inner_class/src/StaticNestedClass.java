

public class StaticNestedClass {

	public static void main(String[] args) {

		OuterCheck.StaticInnerClass outerInner = new OuterCheck.StaticInnerClass();

		outerInner.showVar();

	}

}

class OuterCheck {

	public static int var = 10;

	// This Static Class only Access Static Member of Outer Class
	static class StaticInnerClass {

		int showVar() {

			System.out.println("Outer Class Member : " + var);

			return var;

		}

	}

}
