

public class ExceptionOverriden {

	public static void main(String[] args) {
		
	}
	
}

/*
 * PostFix(1) : If Parent Class Method Does not Declare Exception then in SubClass not Declare Checked(Compile time) Exception
 * 				but, we Declare UnChecked(RunTime) Exception.
 * PostFix(2) : If Parent Class Method Declare Exception the in Subclass Not Mandatory to Declare Exception. but Need to Declare 
 * 				Excepting then must same as Parent Class Exception and also not Declare it's Parent Exception
*/

// PostFix(1)
class ParentException1{
	
	public void parentException() {
		
		System.out.println("Parent Exception Call...1");
	}
	
}
// PostFix(1)
class ChildException1 extends ParentException1{
	
	/*
	 * Here, We Declare RunTime Exception. if we Declare CheckedException then Occur Compile Time Error.
	*/	
	@Override
	public void parentException() throws ArithmeticException{
	
		super.parentException();
	}
	
}

// PostFix(2)
class ParentException2{
	
	public void parentException2() throws ArithmeticException{
		
		System.out.println("Parent Exception Call...2");
		
	}
	
}

// PostFix(2)
class ChildException2 extends ParentException2{
	/*
	 * Here, Declare ArithmeticException same as parent Class Exception.
	 * but if we Declare 'throws Exception' then Occur Compile Time Error
	*/	
	@Override
	public void parentException2() throws ArithmeticException{
		super.parentException2();
	}
	
}
