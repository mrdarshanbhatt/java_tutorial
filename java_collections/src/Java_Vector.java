

import java.util.Iterator;
import java.util.Vector;

// Vector is Dynamic Array to Store Element.
public class Java_Vector {

	public static void main(String[] args) {

		// It is Advance Version of Array...

		// Here Use Object so, any type of Element is Suported...
		Vector<Object> vector = new Vector<>();
		vector.add("Java");
		vector.add(1.8);
		vector.add("is");
		vector.add("best");

		// Print Whole Vector
		System.out.println(vector);

		// Print Step by Step using Iterator...
		Iterator<Object> i = vector.iterator();

		int iterateControl = 0;

		while (i.hasNext()) {

			System.out.println("Element[" + iterateControl + "] : " + i.next());

			iterateControl++;

		}
		// Remove using Index Value
		vector.remove(2);

		// Remove using object Value
		vector.remove("Java");

		// Contain Duplicate Element
		vector.add(2, "best");

		System.out.println(vector);
	}

}
