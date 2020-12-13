

public class NumberSystem {

	public static void main(String[] args) {

		String binary = "1000";

		// binary String and Redix
		// Here Take Redix = 2 so String is Consider as Binary Number
		System.out.println(Integer.parseInt(binary, 2)); // Binary to Decimal

		String octal = "0007";
		System.out.println(Integer.parseInt(octal, 8)); // Octal to Decimal

		String hexaDecimal = "FFFF";
		System.out.println(Integer.parseInt(hexaDecimal, 16)); // HexaDecimal to Decimal

		int decimal = 11;
		System.out.println(Integer.toBinaryString(decimal)); // Decimal to Binary

		int decimalToOctal = 20;
		System.out.println(Integer.toOctalString(decimalToOctal)); // Decimal to Octal

		int decimalToHex = 26;
		System.out.println(Integer.toHexString(decimalToHex)); // Decimal to HexaDecimal
	}

}
/*
 * Redix = 2 : Take as Binary 
 * Redix = 8 : Take as Octal 
 * Redix = 16 : Take as HexaDecimal
 * 
 */
