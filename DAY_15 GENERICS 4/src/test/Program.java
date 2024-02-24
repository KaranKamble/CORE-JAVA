 package test;

interface Pair<K,V>{
	K getKey();
	V getValue();
}

class Dictionary<K,V> implements Pair<K,V>{
	private K key;
	private V value;
	
	public Dictionary(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	@Override
	public V getValue() {
		return this.value;
	}
	
}
public class Program {
	public static void main(String[] args) {
		Pair<Integer,String> p = new Dictionary<>(1,"DAC");
		System.out.println("Key : "+p.getKey());
		System.out.println("Value : "+p.getValue());
	}

}
