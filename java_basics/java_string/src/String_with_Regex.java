

public class String_with_Regex {

	// Using Regex Validate the String
	public static void main(String[] args) {

		String languageFormat = "Java@gmail.com";

		final String emailRegex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

		if (languageFormat.matches(emailRegex)) {

			System.out.println("language is Valid");

		}

	}

}
