

import java.util.Iterator;
import java.util.Stack;

// Stack is Sub-class of Vector that contain All features of vector
public class Java_Stack {

	// Here Perform only push , pop , peek
	public static void main(String[] args) {

		Stack<Object> stack = new Stack<>();
		stack.add("Java1.1");
		stack.add("java1.2");
		stack.add("java1.3");
		stack.add("java1.4");

		// Print Stack
		System.out.println(stack);

		// Print One by one
		Iterator<Object> i = stack.iterator();

		int stackControl = 0;

		while (i.hasNext()) {

			System.out.println("Element[" + stackControl + "] : " + i.next());

			stackControl++;

		}

		// Peek Last Element
		Object lastElement = stack.peek();
		System.out.println(lastElement);

		// Push in TOP OF THE STACK
		stack.push("java1.5");
		System.out.println(stack);

		// POP (Remove) Last Element because Stack Follow LIFO
		stack.pop();
		System.out.println(stack);
	}

}
