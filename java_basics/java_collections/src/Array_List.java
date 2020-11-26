

import java.util.ArrayList;
import java.util.Iterator;

// Use Dynamic Array to Store Element
public class Array_List {

	public static void main(String[] args) {

		// Here Take Object so All type of Value is Support...
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("Java");
		arrayList.add(1.8);
		arrayList.add("is");
		arrayList.add("best");
		arrayList.add(1.9);

		// Print ArrayList
		System.out.println("ArrayList : " + arrayList);

		// Print One by One Element Using Iterator...
		Iterator<Object> i = arrayList.iterator();

		// Use for index
		int element = 0;

		while (i.hasNext()) {

			System.out.println("Element[" + element + "] : " + i.next());

			element++;

		}

		// Remove using Object Value...
		arrayList.remove("Java");
		System.out.println(arrayList);

		// Remove using Index Value...
		arrayList.remove(0);
		System.out.println(arrayList);

		// Get Element using index...
		arrayList.get(1);

		// Array List Contain also Duplicate value...
		arrayList.add("best");
		System.out.println(arrayList);

	}

}
