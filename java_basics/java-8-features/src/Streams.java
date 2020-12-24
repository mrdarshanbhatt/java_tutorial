import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Use for Manipulation
class User {

	String name;
	long income;
	int id;

	public User(String name, long income, int id) {
		this.name = name;
		this.income = income;
		this.id = id;
	}
}

public class Streams {

	public static void main(String[] args) {

		// User list
		List<User> users = Arrays.asList(new User("Darshan", 20000, 123), new User("Hardik", 40000, 345),
				new User("jay", 60000, 999), new User("tulesh", 60000, 999), new User("Mangal", 100000, 0440),
				new User("Jayesh", 90000, 1000));

		// Filter the List Of User using Stream
		users.parallelStream().filter(u -> u.income > 50000).collect(Collectors.toList())
				.forEach(u -> System.out.println("User : " + u.name));

		// Find the Distinct User and it's salary is lessThan One Lakhs Rupees
		Map<String, Long> maximum1 = users.parallelStream().distinct().filter(u -> u.income < 100000)
				.collect(Collectors.toMap(u -> u.name, u -> u.income));

		System.out.println(maximum1);

// ===================================================================================================================================================================================		

		// Primitive list
		int[] intArray = { 3, 5, 4, 7, 6, 90, 88, 76, 54, 34, 56 };

		// Any Match Return True
		System.out.println(IntStream.of(intArray).anyMatch(n -> n == 100));

		// It Return Smallest Int Value
		System.out.println(IntStream.of(intArray).min().getAsInt());

		IntStream.of(intArray).sorted().skip(intArray.length - 3)
				.forEach(maximum -> System.out.print("Max : " + maximum + ","));

	}

}

/*
 * What is Stream and Parallel Stream in Java-8 collection
 * 
 * -> Parallel Stream is Doing the Task in Parallel mode, like provided Task are
 * Divided in many and run this all task in Separate Thread. That Means it
 * utilize the Multicore processor of our Computers
 * 
 * -> Normal Stream is Doing the Task is Sequencially same like List in
 * Collection. so it usage the Single core of Computer
 * 
 */
