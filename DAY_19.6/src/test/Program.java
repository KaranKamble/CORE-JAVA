package test;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

class Program {

	private static Dictionary<Integer, String> getDictionary() {
		Dictionary<Integer, String> d = new Hashtable<Integer, String>();
		d.put(7, "DAC");
		d.put(12, "Dmc");
		d.put(35, "DESF");
		d.put(42, "DBDA");
		return d;
	}

	private static void find(Dictionary<Integer, String> d, int id) {
		if (d != null) {
			Integer key = new Integer(id);
			String value = d.get(key);
			if (value != null)
				System.out.println(key + "  :  " + value);
			else
				System.out.println(key + " not found.");
		}
	}

	private static void remove(Dictionary<Integer, String> d, int id) {
		if (d != null) {
			Integer key = new Integer(id);
			String value = d.remove(key);
			if (value != null)
				System.out.println(key + "  :  " + value);
			else
				System.out.println(key + " not found.");
		}
	}

	private static void printKeys(Dictionary<Integer, String> d) {
		if (d != null) {
			Enumeration<Integer> keys = d.keys();
			while (keys.hasMoreElements()) {
				Integer key = keys.nextElement();
				System.out.println(key);
			}
		}
	}

	private static void printValues(Dictionary<Integer, String> d) {
		if (d != null) {
			Enumeration<String> values = d.elements();
			while (values.hasMoreElements()) {
				String value = values.nextElement();
				System.out.println(value);
			}
		}
	}

	private static void print(Dictionary<Integer, String> d) {
		if (d != null) {
			Enumeration<Integer> keys = d.keys();
			while (keys.hasMoreElements()) {
				Integer key = keys.nextElement();
				String value = d.get(key);
				System.out.println(key + "  :  "+value);
			}
		}
	}

	public static void main(String[] args) {
		Dictionary<Integer, String> d = Program.getDictionary();

		Program.printKeys(d);
		Program.printValues(d);
		Program.print(d);
		Program.find(d, 12);
		Program.remove(d, 12);
	}
}
