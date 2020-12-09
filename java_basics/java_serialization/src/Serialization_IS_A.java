package java_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_IS_A {

	public static void main(String[] args) throws Exception {

		ObjectOutputStream doSerial = new ObjectOutputStream(new FileOutputStream("G:\\1.txt"));

		doSerial.writeObject(new ParentIsSerial("IS-A Serialization..."));

		doSerial.flush();

		doSerial.close();

		ObjectInputStream reverceSerial = new ObjectInputStream(new FileInputStream("G:\\1.txt"));

		ChildISSerial actualText = (ChildISSerial) reverceSerial.readObject();

		System.out.println("String Member : " + actualText.isASerial);

		reverceSerial.close();

	}

}

/*
 * If we Declare Parent Class as Serializable then Implicitly Declare SubClass
 * as Serializable
 */
class ParentIsSerial implements Serializable {

	// It is Unique Identification od Serializable Class. it at the time of
	// DeSerialization
	private static final long serialVersionUID = 1L;

	String isASerial = "IS-A Serialization";

	public ParentIsSerial(String string) {

		this.isASerial = string;

	}

}

class ChildISSerial extends ParentIsSerial {

	private static final long serialVersionUID = 1L;

	public ChildISSerial(String string) {

		super(string);

	}

}