

/*
	Local Inner Class Means Create Class Within the Another Class Method
*/
public class LocalInnerClass {

	public static void main(String[] args) {

		OuterLocalClass outerLocalClass = new OuterLocalClass(12);
		
		outerLocalClass.showVariables();

	}

}

class OuterLocalClass {

	final int localInt;

	// if you not Initialize final Variable at Runtime then Simply use Java
	// Constructor..
	public OuterLocalClass(int i) {
		this.localInt = i;
	}

	public void showVariables() {

		// if you use jdk1.7 or below version then Must Declare Variable as Final. in jdk1.8 that's not Requried
		final String name = "Java";

		// this Class is Not Initialize outside the method
		class InnerLocalClass {

			void innerLocalMethod(String name) {

				System.out.println("Show Inner Local Class Method. with : " + localInt);
			}

		}

		InnerLocalClass innerLocalClass = new InnerLocalClass();
		innerLocalClass.innerLocalMethod(name);

	}

}

/*
 * NOTE : Local inner class cannot access non-final local variable till JDK 1.7.
 * Since JDK 1.8, it is possible to access the non-final local variable in local
 * inner class.
 */