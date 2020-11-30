import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
 * Java TreeSet is Fast then Both LinkedHashSet and HashSet excluding  its Insertion and removal Order
 * 
 * It Maintain Order at Insertion of Each Elements
 * 
 * It Has POlling  Concept
*/
public class Java_TreeSet {

	public static void main(String[] args) {

		List<Object> objects = Arrays.asList("Java1", "Java2", "Java5", "Java4", "Java3", "Java6");

		TreeSet<Object> treeSet = new TreeSet<>(objects);

		// Default in Ascending order
		System.out.println(treeSet);

		// It Gives Descending Order of Set
		System.out.println(treeSet.descendingSet());

		// TreeSet has Features of Descending Iterator
		Iterator<Object> iterator = treeSet.descendingIterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
 
		// it Gives the SubSet and TailSet with Boolean Args
		System.out.println(treeSet.subSet("Java2", true, "Java6", false)); // True -> Inclusive 
																		   // False -> Exclusive
		
		
	}

}
