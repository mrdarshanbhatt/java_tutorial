

@SuppressWarnings("unused")
public class AnonymousInnerClass {

	public static void main(String[] args) {

		// Automatic Define Method of abstract class as Anonymous
		AnonymousClass anonymous = new AnonymousClass() {

			@Override
			public void rootKit() {

				System.out.println("Rootkit Call");

			}

		};

		// Automatic Define Method of Interface as Anonymous
		AnonymousInterface anonymousInter = new AnonymousInterface() {

			@Override
			public void incident() {

				System.out.println("incident call");

			}

		};

	}

}

//Class is Extends by Compiler && Class Name Decided By Complier
abstract class AnonymousClass {

	public abstract void rootKit();
}

//Interface is Implement by Compiler && Class Name Decided By Complier
interface AnonymousInterface {

	public void incident();

}
