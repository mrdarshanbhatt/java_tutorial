import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Access Private method specific Class use in another class using Refliction API
*/
@SuppressWarnings({ "unchecked", "rawtypes" })
public class AccessPrivateMethod {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

		Class c = Class.forName("TestPrivate");

		Method method = c.getDeclaredMethod("privateAccess", null);

		method.setAccessible(true);

		method.invoke(c.newInstance(), null);
	}

}

@SuppressWarnings("unused")
class TestPrivate {

	private void privateAccess() {
		System.out.println("Access private method...");
	}

}
