

public class Encapsulation {

	public static void main(String[] args) {

		ReadOnlyClass readOnly = new ReadOnlyClass();
		System.out.print(readOnly.getName());

		WriteOnlyClass writeOnly = new WriteOnlyClass();
		System.out.print(writeOnly.setName("Is Best..."));

	}

}

class ReadOnlyClass {

	private String name = "Java Language...";

	public String getName() {

		return this.name;

	}

}

class WriteOnlyClass {

	private String surName = "java";

	public String setName(String surName) {

		return this.surName = surName;

	}

}
