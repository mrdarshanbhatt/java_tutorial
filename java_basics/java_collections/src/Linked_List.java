

import java.util.Iterator;
import java.util.LinkedList;

// Store Element Internally as Doubly LinkedList
public class Linked_List {

	public static void main(String[] args) {

		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add("Java");
		linkedList.add(1.8);
		linkedList.add("is");
		linkedList.add("best");

		// Print LinkedList
		System.out.println(linkedList);

		// Print One by One Element Using Iterator...
		Iterator<Object> i = linkedList.iterator();

		// Use for index
		int element = 0;

		while (i.hasNext()) {

			System.out.println("Element[" + element + "] : " + i.next());

			element++;

		}

		// Add element using index... Use When we have Large Data List
		linkedList.add(4, "Java");

		// Default Remove 1st Element...
		linkedList.remove();
		System.out.println(linkedList);
	}

}
