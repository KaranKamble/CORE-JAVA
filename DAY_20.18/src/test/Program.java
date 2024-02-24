package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) {
		Integer number = new Integer(0);
		Class<?> c = number.getClass();

		Program.printTypeInfo(c);
		Program.getFieldInfo(c);
		Program.printConstructorInfo(c);
		Program.printMethodInfo(c);
		
	}

	private static void printMethodInfo(Class<?> c) {
		if (c != null) {
			Method[] methods = c.getMethods();
			for(Method method : methods)
				System.out.println(method.toString());
		}
		
	}

	private static void printConstructorInfo(Class<?> c) {
		if (c != null) {
			Constructor<?>[] constructors = c.getConstructors();
			for (Constructor<?> constructor : constructors)
				System.out.println(constructor.toString());
		}

	}

	private static void getFieldInfo(Class<?> c) {
		if (c != null) {
			Field[] fields = c.getFields();
			for (Field field : fields)
				System.out.println(field.toString());
		}

	}

	private static void printTypeInfo(Class<?> c) {
		if (c != null) {
			System.out.println("Package Name : " + c.getPackage().getName());
			System.out.println("Class Name : " + c.getSimpleName());
			System.out.println("Class Name : " + c.getName());
		}

	}
}
