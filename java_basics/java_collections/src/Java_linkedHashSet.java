import java.util.LinkedHashSet;

/* 	
 * LinkedHashSet is Slower then HashSet Because It 
 * Internally Use LinkedHashMap and Maintain the Insertion Order
 * 
 * It Allow one Null Object
*/

public class Java_linkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Object> linkdHashSet = new LinkedHashSet<>();
		linkdHashSet.add("Java");
		linkdHashSet.add("linked");
		linkdHashSet.add("set");
		linkdHashSet.add(1);

		System.out.println(linkdHashSet);

	}

}
