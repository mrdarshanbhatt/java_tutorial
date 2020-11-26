

import inner_class.DisplayInterface.ShowInterface;

public class NestedInterface implements ShowInterface, DisplayInterface {

	public static void main(String[] args) {

		// UpCasting the DataType (Dynamic Method Dispatch)...
		DisplayInterface.ShowInterface interface1 = new NestedInterface();

		interface1.show();

	}

	@Override
	public void display() {

	}

	@Override
	public void show() {

		System.out.println("Show Method Call.");

	}

}

// outer interface
interface DisplayInterface {

	void display();

	// inner Interface
	interface ShowInterface {

		void show();

	}

}
