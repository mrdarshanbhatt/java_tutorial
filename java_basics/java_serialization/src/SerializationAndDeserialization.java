package java_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization means Object Convert in to the Stream and it Reverse Process is called DeSerialization
public class SerializationAndDeserialization {

	public static void main(String[] args) throws Exception {
		
		ObjectOutputStream doSerial = new ObjectOutputStream(new FileOutputStream("G:\\1.txt"));

		doSerial.writeObject(new Serial(123, "Non Serial String"));
 
		doSerial.flush();

		doSerial.close();

		ObjectInputStream reverceSerial = new ObjectInputStream(new FileInputStream("G:\\1.txt"));

		Serial actualText = (Serial) reverceSerial.readObject();

		System.out.println("String Member : " + actualText.nonSerial);

		System.out.println("Integer Member : " + actualText.roll);

		reverceSerial.close();
	}

}

class Serial implements Serializable {

	private static final long serialVersionUID = 1L;

	int roll = 123;

	// Transient keyword means it not Serialize
	transient String nonSerial = "Java-Serialization";

	public Serial(int roll, String nonSerial) {

		this.roll = roll;
		this.nonSerial = nonSerial;

	}

}