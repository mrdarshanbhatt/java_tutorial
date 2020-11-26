

class Multi_Level_Inheritence {

	/*
	 * (1). One object acquires the properties(Behavior) of Parent class (2). IS-A
	 * Relationship (3). RunTime Polymorphism
	 */

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {

		// Call Student Constructor
		Student student = new Student();

	}

}

class Faculty {

	static int sId = 33;

	@SuppressWarnings("static-access")
	public void getSupervisor(int sId) {

		this.sId = sId;

		System.out.println("Id : " + sId);

	}

}

class Principal extends Faculty {

	static int after = sId;

	public static void afterAccess() {

		System.out.println("After Access :" + after);

	}

}

class Student extends Principal {

	void Principal() {

		// Principal Data
		System.out.println("Principal Id : " + after);

		afterAccess();

		// Faculty Data
		System.out.println("Faculty Id : " + sId);

		getSupervisor(sId);
	}

}
