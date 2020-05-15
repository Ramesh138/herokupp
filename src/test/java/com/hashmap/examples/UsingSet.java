package com.hashmap.examples;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class UsingSet {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		
		hmap.put(1, "Ramesh");
		hmap.put(2, "Suresh");
		hmap.put(3, "Mahesh");
		
		hmap.put(4,"jetesh" );
		
		Set<Entry<Integer, String>> entrySet = hmap.entrySet();
		System.out.println("EntrySet: "+entrySet);
	}

}
