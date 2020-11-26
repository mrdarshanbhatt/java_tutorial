

// Concrete Class means Fully Implemented Class. 
// We can also say that Non-Abstract class is called as Concrete Class
// Which class is Initialize by New keyword is Called Concrete Class

public class ConcreteClass {

	public static void main(String[] args) {

		// Initialize by new Keyword
		ABChild abChild = new ABChild();

	}
}

interface concrete {

	public void firstName();

	public void lastName();

}

// Not Concrete Class
abstract class ABParent implements concrete {

	@Override
	public void firstName() {

		System.out.println("FirstName");

	}

}

// This is Concrete Class
class ABChild extends ABParent {

	@Override
	public void lastName() {

		System.out.println("LastName");

	}

}
