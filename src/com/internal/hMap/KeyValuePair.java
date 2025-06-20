package com.internal.hMap;

//HashMap contains array of Node and a Node class contains - key, hash, value and Node next; as variable.

public class KeyValuePair<K, V> {
	
	K key;
	V value;
	
	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	//hashCode of null key always zero in HashMap

}
