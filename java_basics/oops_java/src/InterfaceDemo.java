

// Only Method Declaration is possible
interface inter {

	// Variable By Default Constant
	int i = 10;

	// Method only Declaration
	public void getData();

	// In Interface Required Body part for Static Method (Java - 8)
	public static void fetchData() {
		System.out.println("Static Mrthod...");
	}

}

class Demo implements inter {

	@Override
	public void getData() {

		System.out.println("Get data Method Call");

	}

}

public class InterfaceDemo extends Demo {

	public static void main(String[] args) {

		InterfaceDemo runDemo = new InterfaceDemo();
		
		runDemo.getData();

	}

}