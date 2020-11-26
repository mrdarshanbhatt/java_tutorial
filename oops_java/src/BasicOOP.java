

/*
 * Object, Class, Inheritance, Polymorphism, Abstraction, Encapsulation
 * 
 * Coupling, Cohesion, Association, Aggregation, Composition
 */

public class BasicOOP {

	int classVariable = 123;

	/*
	 * (1). Constructor No return Type 
	 * (2). Same name as Class name 
	 * (3). Parameterized 
	 * (4). non-Parameterized
	 */
	public BasicOOP() {

		System.out.println("Contructor");

	}

	public BasicOOP(int classVariable) {

		// 'this' refer current Object
		this.classVariable = classVariable;

		System.out.println(classVariable);

	}

	public void getData(String data) {

		System.out.println("Data get Successfully.");

	}

	public static void getDataStatic(String data) {

		System.out.println("Static Data get.");

	}

	public static void main(String[] args) {

		/*
		 * Class object has 3 things
		 * 
		 * (1). State (2). Behavior (3). Identity
		 * 
		 */
		BasicOOP basicOOP = new BasicOOP(0);

		basicOOP.getData("Java");

		// static method call without create object
		getDataStatic("java");
	}

}
