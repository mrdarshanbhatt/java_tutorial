

public class StringBufferDemo {

	// String Buffer is Mutable String , Change the value after Initialization
	public static void main(String[] args) {

		StringBuffer ss = new StringBuffer("Security");
		System.out.println(ss.capacity());

		ss.ensureCapacity(40); // Increase Capacity

		System.out.println(ss.capacity());

		System.out.println("length: " + ss.length());

		ss.append("+i");
		System.out.println("append: " + ss);

		ss.delete(1, 3);
		System.out.println("deleted: " + ss);

		ss.reverse();
		System.out.println("reverse: " + ss);

		ss.insert(0, "S");
		System.out.println("Insert : " + ss);
	}

}
