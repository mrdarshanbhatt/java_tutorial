

public class MethodOverLoading {

	// Number of Argument different
	
	// Type of Argument different
	
	// Not depends on return type
	public void addition(float a, float b) {

		System.out.println("Two variable addition : " + (a += b));

	}

	public void addition(float a, float b, float c) {

		System.out.println("Three variable addition : " + (a += (b + c)));

	}

	public static void main(String[] args) {

		MethodOverLoading overLoading = new MethodOverLoading();

		overLoading.addition(1.1f, 1.1f);

	}

}
