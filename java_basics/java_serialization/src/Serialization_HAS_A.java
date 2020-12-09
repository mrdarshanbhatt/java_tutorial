package java_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_HAS_A {

	public static void main(String[] args) throws Exception {

		ObjectOutputStream doSerial = new ObjectOutputStream(new FileOutputStream("G:\\1.txt"));

		doSerial.writeObject(new SamsungMobile("Samsung"));

		doSerial.flush();

		doSerial.close();

		ObjectInputStream reverceSerial = new ObjectInputStream(new FileInputStream("G:\\1.txt"));

		SamsungMobile actualText = (SamsungMobile) reverceSerial.readObject();

		System.out.println("String Member : " + actualText.mobile.name);

		reverceSerial.close();

	}

}

// In this Code Occur ' java.io.NotSerializableException'

// In java Serilization if Child Class Implement Serializable then Compulsory to implemtnt Serilizable, in Case of Aggrigation 

class Mobile {

	String name = "LAVA";

	public Mobile() {

		System.out.println("Mobile price : " + name);

	}

}

class SamsungMobile implements Serializable {

	private static final long serialVersionUID = 1L;

	// Perform Aggrigation
	public Mobile mobile = new Mobile();

	public SamsungMobile(String name) {

		System.out.println(name);
	}

}
