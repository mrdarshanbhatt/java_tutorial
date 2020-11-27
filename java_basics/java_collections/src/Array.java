
// Array Store Primitive DataType while Collection Classes Are Store Primitive DataType it Automatic Cast to the Object 
public class Array {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Array is Collection of element...
		Object[] a, b, c; // all are array
		Object d[], e[], f[]; // all are array

		int array[] = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

		String stringArray[] = { "java", "is", "best" };
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}
}
