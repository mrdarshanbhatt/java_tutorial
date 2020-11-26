

public class MethodOverRiding {

	// Same name as Parent Class
	// Both class in IS-A relation ship
	// Same Parameter as Parent class

	public static void main(String[] args) {

		subClass class1 = new subClass();

		class1.value(1.1f);

	}

}

class parentClass {

	public void value(int a) {

		System.out.println("Integer Argument in Parent");

	}

	public void value(float a) {

		System.out.println("Float Argument in Perent");
	}

}

class subClass extends parentClass {

	public void value(int a) {

		System.out.println("Integer Argument");
	}

	public void value(float a) {

		System.out.println("Float Argument");

	}

}
