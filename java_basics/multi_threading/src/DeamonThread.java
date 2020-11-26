

// Deamon Thread means low Priority Thread
public class DeamonThread {

	public static void main(String[] args) {

		// call 2 thread for check Status for isDeamon()
		Deamon deamon = new Deamon();
		Deamon deamon2 = new Deamon();

		deamon.setName("First Deamon Thread");
		deamon.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY - 10
		deamon.setDaemon(true);
		deamon.start();
		System.out.println("First Status: " + deamon.isAlive());

		deamon2.setName("Second Deamon Thread");
		deamon2.setPriority(Thread.NORM_PRIORITY); // NORM_PRIORITY - 5
		deamon2.start();
		System.out.println("Second Status: " + deamon2.isAlive());

	}

}

class Deamon extends Thread {

	@Override
	public void run() {

		if (Thread.currentThread().isDaemon() && Thread.currentThread().isAlive())

			System.out.println("Java Inbuild Thread running");

		else

			System.out.println("Custom Thread Running");

	}

}
