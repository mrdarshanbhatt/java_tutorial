

import java.io.IOException;

public class ChainException {

	public static void main(String[] args) throws Throwable {

		ChainException r = new ChainException();

		try {

			r.devided(0, 0);

		} catch (ArithmeticException exception) {

			System.out.println("Java.lang.Exception:" + exception.getCause());

		}

	}

	void devided(int i, int j) throws Throwable {

		if (j == 0)

			throw new ArithmeticException("Devided by zero").initCause(new IOException("Denominator is not Zero"));

		else

			System.out.println("X/Y : " + (i / j));

	}

}
