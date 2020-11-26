

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// Queue follow the FIFO (First In First Out)
public class Java_Queue {

	public static void main(String[] args) {

		Queue<Object> queue = new PriorityQueue<Object>();

		queue.add("Java");
		queue.add("1.8");
		queue.add("is");
		queue.add("best");

		// Print Queue
		System.out.println(queue);

		// Print one by one
		Iterator<Object> i = queue.iterator();

		int queueControl = 0;

		while (i.hasNext()) {

			System.out.println("Element[" + queueControl + "] : " + i.next());

			queueControl++;
		}

		// Remove first Element by Default
		queue.remove();
		System.out.println(queue);

		// Retrieve Head of the Queue
		Object headOfQueue = queue.peek();
		System.out.println(headOfQueue);

		// Insert and Delete the Element
		queue.poll();
		System.out.println(queue);

		// Insert Element in Queue
		queue.offer("Technology");
		System.out.println(queue);

	}

}
