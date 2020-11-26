

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Java_Dqueue {

	public static void main(String[] args) {

		Deque<Object> deque = new ArrayDeque<>();

		deque.add("java");
		deque.add("1.8");
		deque.add("is");
		deque.add("best");

		// Print DeQueue
		System.out.println(deque);

		// Print one by one
		Iterator<Object> i = deque.iterator();

		int control = 0;

		while (i.hasNext()) {

			System.out.println("Element[" + control + "] : " + i.next());

			control++;

		}

		// Insert At last Default
		deque.offer("Tech");
		System.out.println(deque);

		// Insert At Last
		deque.addLast("Techie");
		System.out.println(deque);

		// Insert At First
		deque.addFirst("Linked in");
		System.out.println(deque);

		// Remove First
		deque.removeFirst();

		// Remove Last
		deque.removeLast();

		// Retrieve the First Element of the Queue
		Object topOfTheElement = deque.element();
		System.out.println(topOfTheElement);

		// Many Operation are Present in Dqueue

	}

}
