

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collections Class mostly use in Industry Purpose
public class Java_Collections {

	public static void main(String[] args) {

		// Take any Collection Concept for Execute the Collections
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(60);
		list.add(12);
		list.add(12);
		list.add(100);

		int i = Collections.binarySearch(list, 12, Collections.reverseOrder());

		System.out.println("'is' element Index : " + i);

		// Find MAX
		System.out.println(Collections.max(list, null));

		// Find MIN
		System.out.println(Collections.min(list, null));

		// Occurrence of Element
		System.out.println(Collections.frequency(list, 12));

		// Make Immutable Set
		System.out.println(Collections.singleton(12));

	}

}
