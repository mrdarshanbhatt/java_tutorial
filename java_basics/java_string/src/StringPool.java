
public class StringPool {

	public static void main(String[] args) {

		// Store in String pool
		String language = "Java1"; // Store in Pool
		
		// Store Heap Means OutOf the String Pool
		String techLanguage = new String("Java2"); // Store in heap
		
		
		System.out.println(language.hashCode());
		System.out.println(techLanguage.hashCode());
		
		// Store in Pool any String 
		System.out.println(techLanguage.intern());
		
	}
}
/*
 *  (1). Why String pool Always Contain Distinct String ?
 *  ans. String Pool Concept internally Use the String-Interning.
 *  
 *  (2). What is String-Interning
 *  ans. String interning is a method of storing only one copy of each distinct string value.
 *  	 also all String is Immutable
*/
