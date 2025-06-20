package com.internal.hMap;

import java.util.LinkedList;

public class CustomHashMap<K, V> {

	private static final int DEFAULT_CAPACITY = 16;
	
	private LinkedList<KeyValuePair<K, V>>[] buckets;
	
	private int size;
	
	CustomHashMap() {
		this(DEFAULT_CAPACITY);
	}

	public CustomHashMap(int defaultCapacity) {
		// TODO Auto-generated constructor stub
		buckets = new LinkedList[defaultCapacity];
		size = 0;
	}
	
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		return Math.abs(hashCode)%buckets.length;
	}
	
	public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (KeyValuePair<K, V> pair : buckets[index]) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }

        buckets[index].add(new KeyValuePair<>(key, value));
        size++;
    }
	
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<KeyValuePair<K, V>> bucket = buckets[index];
        if (bucket != null) {
            for (KeyValuePair<K, V> pair : bucket) {
                if (pair.key.equals(key)) {
                    return pair.value;
                }
            }
        }
        return null;
    }
	
	public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<KeyValuePair<K, V>> bucket = buckets[index];
        if (bucket != null) {
            for (KeyValuePair<K, V> pair : bucket) {
                if (pair.key.equals(key)) {
                    bucket.remove(pair);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }
	
	
}
