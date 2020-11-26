

public class InstanceOf {

	public static void main(String[] args) {

		Train train = new Train();

		if (train instanceof Train)

			System.out.println("Yes, Train is Running....");

		else

			System.out.println("Diesel Tank is Empty...");

	}

}

class Train {

	public Train() {

		System.out.println("Train Runnig....");
	}

}
