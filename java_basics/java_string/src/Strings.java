

public class Strings {

	// String in java
	public static void main(String[] args) {

		String s = "Security";
		String ss = "Security"; // Does not create a new Object use String Constant Pool

		System.out.println("original data: " + s);

		System.out.println("Char at methos = " + ss.charAt(4));

		System.out.println("InUppercase = " + s.toUpperCase());

		System.out.println("InLOwerCase = " + s.toLowerCase());

		System.out.println("IndexOF method = " + s.indexOf('l'));

		System.out.println("LastIndexOf Method" + s.lastIndexOf('e'));

		System.out.println("Compareto method = " + s.compareTo("Computer"));

		System.out.println("Equal Ignore case = " + s.equalsIgnoreCase("Stagnography"));

		System.out.println("Equal method = " + s.equals("Hacking"));

		System.out.println(" Replace method =" + s.replace('i', 'e'));

		System.out.println("Start with = " + s.startsWith("hi"));

		System.out.println("End With =" + s.endsWith("ve"));

		System.out.println("Trim Method = " + s.trim());
		
		System.out.println("Contains Method = " + s.contains("ty"));

	}

}
