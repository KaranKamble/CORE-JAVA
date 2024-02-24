package test;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

class EntryImpl<K,V> implements Entry<K, V>{
	private K key;
	private V value;
	
	public EntryImpl(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		
		return null;
	}

	@Override
	public V getValue() {
		
		return null;
	}

	@Override
	public V setValue(V value) {
		
		return null;
	}
	
}

class HashTable<K,V>{
	private Set<Entry<K,V>> entries;
	
	public HashTable() {
		this.entries = new HashSet<Entry<K,V>>();
	}
	public void put(K key,V value) {
		Entry<K, V> entry = new EntryImpl(key, value);
		this.entries.add(entry);
		
	}
}
class Program {
	public static void main(String[] args) {
		HashTable<Integer,String> ht = new HashTable();
		ht.put(1,"DAC");
		ht.put(2,"DMC");
		ht.put(3,"DESF");
	}
}
