import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaPTool {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		
		Class c = args[0].getClass();

		System.err.println("\n\nAll Declare Fields of " + c.getName() + "Class\n\n");

		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		System.err.println("\n\nAll Declare Constructor of " + c.getName() + "Class\n\n");
		Constructor[] constructors = c.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}

		System.err.println("\n\nAll Method Method of " + c.getName() + "Class\n\n");
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}

}
