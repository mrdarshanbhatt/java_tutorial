

/**
 * this is For Doc
 * 
 */


public class AutoBoxing {

	// AutoBoxing means Primitive DataType to Object DataType
	public static void main(String[] args) {

		int i = 234; // Primitive
		System.out.println("int : " + i);

		Integer intObject = i; // Cast Primitive to Object
		System.out.println("Integer : " + intObject);

		// Cross Wrapping
		int ii = 10;
		Float float1 = (float) ii;
		System.out.println("Float  : " + float1);

		// AutoBoxing is Perform by using WrapperClass.valueOf(Variable)
	}

}
//	boolean	:	Boolean

//	char	:	Character

//	byte	:	Byte

//	short	:	Short

//	int	    :	Integer

//	long	:	Long

//	float	:	Float

//	double	:	Double
