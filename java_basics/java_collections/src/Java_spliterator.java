import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

// Spliterator use for Parallel Traversing
public class Java_spliterator {

	public static void main(String[] args) {

		List<Integer> integers = new LinkedList<Integer>();

		for (int i = 100; i < 120; i++) {

			integers.add(i);

		}

		LinkedList<Object> objects = new LinkedList<Object>();

		Stream<Integer> stream = integers.stream();

		Spliterator<Integer> spliterator = stream.spliterator();

		spliterator.forEachRemaining((a) -> objects.add(a));

		System.out.println(objects);
		
	}

}
