import java.util.LinkedList;
import java.util.ListIterator;

// List Iterator use for Next and Previous Element Access 
public class Java_listIterator {

	public static void main(String[] args) {

		LinkedList<Object> linkedList = new LinkedList<>();

		for (int i = 0; i < 20; i++) {

			linkedList.add(i);

		}

		/*
		 * if you not add the Index in listIterator Constructor then no find any
		 * Previous Element Because it ByDefault Consider First Element
		 */
		ListIterator<Object> iterator = linkedList.listIterator(linkedList.size());

		while (iterator.hasPrevious()) {

			System.out.println(iterator.previous());

		}

	}

}
