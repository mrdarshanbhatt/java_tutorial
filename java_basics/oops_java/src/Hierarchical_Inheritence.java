

public class Hierarchical_Inheritence {

	public static void main(String[] args) {

		Bike bike = new Bike();
		System.out.println(bike.bikeStatus());

		TVS tvs = new TVS();
		System.out.println(tvs.TVSBikeStatus());

		HERO hero = new HERO();
		System.out.println(hero.HEROBikeStatus());

	}

}

class Bike {

	public String bikeStatus() {

		return "Running";

	}

}

class TVS extends Bike {

	public String TVSBikeStatus() {

		return "TVS Bike " + bikeStatus();

	}

}

class HERO extends Bike {

	public String HEROBikeStatus() {

		return "HERO Bike " + bikeStatus();

	}

}
