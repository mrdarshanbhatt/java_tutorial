

public class MemberInnerClass {

	public static void main(String[] args) {

		// Create Object of outer Class
		OuterClass outerClass = new OuterClass();

		// Configure with Inner Class
		OuterClass.Inner in = outerClass.new Inner();

		// Then Call the Method
		System.out.println("Inner Classs Method :" + in.InnerMethod());
	
	}

}

// Inner Class advantages is that we can access the Private Data member of Oter class

@SuppressWarnings("static-access")
class OuterClass {

	private int outerVar = 234;

	class Inner {

		public String InnerMethod() {

			return new String().valueOf(outerVar);

		}
	}

}
