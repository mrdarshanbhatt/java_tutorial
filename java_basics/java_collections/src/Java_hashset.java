import java.util.HashSet;

public class Java_hashset {

	public static void main(String[] args) {

		// 1-args : capacity
		// 2-args : Load Factor
		HashSet<Integer> integers = new HashSet<>(2, 0.2f);

		for (int i = 0; i < 100; i++) {

			integers.add(i);

		}

		System.out.println(integers);

	}

}
