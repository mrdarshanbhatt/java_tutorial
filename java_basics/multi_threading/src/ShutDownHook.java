

public class ShutDownHook {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		runtime.addShutdownHook(new ShutDown());

		System.out.println("Shutdown Processing...");

		runtime.removeShutdownHook(new ShutDown());

		// Stop the Shutdown invoking using halt
		runtime.halt(1);

	}

}

class ShutDown extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);

		}

	}

}
