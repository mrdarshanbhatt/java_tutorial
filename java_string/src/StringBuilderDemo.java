

public class StringBuilderDemo {

	public static void main(String[] args) {

		// String Builder is Mutable String , Change the value after Initialization
		StringBuilder builder = new StringBuilder("Computer");
		System.out.println(builder.capacity());

		builder.ensureCapacity(40);

		System.out.println(builder.capacity());

		System.out.println("length: " + builder.length());

		builder.append("i");
		System.out.println("appended String: " + builder);

		builder.delete(1, 3);
		System.out.println("deleted String : " + builder);

		builder.reverse();
		System.out.println("reverse String: " + builder);

		builder.insert(0, "Java");
		System.out.println("Insert : " + builder);
	}

}
