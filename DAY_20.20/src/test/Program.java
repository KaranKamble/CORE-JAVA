package test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

class Convert {

	public static Object changeType(String type, String value) {
		switch (type) {
		case "int":
			return Integer.parseInt(value);
		case "float":
			return Float.parseFloat(value);
		case "double":
			return Double.parseDouble(value);
		}
		return null;
	}

}

public class Program {	//Middleware Application
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("F.Q.Class Name  :  ");
			String className = sc.nextLine(); // math.Calculator
			Class<?> c = Class.forName(className);

			System.out.println("Method Name  :  ");
			String methodName = sc.nextLine(); // sub
			Method[] methods = c.getMethods();

			for (Method method : methods) {
				if (method.getName().equalsIgnoreCase(methodName)) {
					Parameter[] parameters = method.getParameters();
					Object[] arr = new Object[method.getParameterCount()];
					for (int index = 0; index < arr.length; ++index) {
						String type = parameters[index].getType().getName();
						System.out.println("Enter value for argument of " + type + " Type : ");
						String value = sc.nextLine();
						arr[index] = Convert.changeType(type, value);
					}
					Object obj = c.newInstance();
					Object result = method.invoke(obj, arr);
					System.out.println("Result  :  " + result);
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
