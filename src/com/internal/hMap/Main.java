package com.internal.hMap;

public class Main {
	
	public static void main(String[] args) {
		
		CustomHashMap<String, Integer> hashMap = new CustomHashMap<String, Integer>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        System.out.println("Size: " + hashMap.size());
        System.out.println("Value for 'one': " + hashMap.get("one"));
        System.out.println("Value for 'two': " + hashMap.get("two"));
        System.out.println("Value for 'three': " + hashMap.get("three"));

        hashMap.remove("two");
        System.out.println("Size after removing 'two': " + hashMap.size());
        System.out.println("Value for 'two' after removal: " + hashMap.get("two"));
        
	}

}
