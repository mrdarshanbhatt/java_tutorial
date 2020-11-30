
public class NestedInterface implements DisplayInterface.ShowInterface, DisplayInterface {

	public static void main(String[] args) {

		// UpCasting the DataType (Dynamic Method Dispatch)...
		DisplayInterface.ShowInterface showDisplay = new NestedInterface();

		showDisplay.show();

	}

	@Override
	public void display() {

	}

	@Override
	public void show() {
		
		System.out.println("Call Show Method");

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
