package test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Program {

	public static Map<Integer, String> getMap() {
		Map<Integer, String> d = new Hashtable<Integer, String>();
		d.put(7, "DAC");
		d.put(12, "DMC");
		d.put(35, "DESF");
		d.put(42, "DBDA");
		return d;
	}

	private static void find(Map<Integer, String> map, int id) {
		if (map != null) {
			Integer key = new Integer(id);
			if (map.containsKey(key)) {
				String value = map.get(key);
				System.out.println(key + "  :  " + value);
			} else
				System.out.println(key + " not found.");
		}
	}

	private static void remove(Map<Integer, String> map, int id) {
		if (map != null) {
			Integer key = new Integer(id);
			if (map.containsKey(key)) {
				String value = map.remove(key);
				System.out.println(key + "  :  " + value + " is removed.");
			} else
				System.out.println(key + " not found.");
		}
	}

	private static void printKeys(Map<Integer, String> map) {
		if (map != null) {
			Set<Integer> keys = map.keySet();
			for (Integer key : keys) {
				System.out.println(key);
			}
		}
	}

	private static void printValues(Map<Integer, String> map) {
		if (map != null) {
			Collection<String> values = map.values();
			for (String value : values) {
				System.out.println(value);
			}
		}
	}

	private static void print(Map<Integer, String> map) {
		if (map != null) {
			Set<Entry<Integer, String>> entries = map.entrySet();
			for (Entry<Integer, String> entry : entries) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> map = Program.getMap();
		Program.printKeys(map);
		Program.printValues(map);
		Program.print(map);
		Program.find(map, 12);
		Program.remove(map, 12);
	}
}
