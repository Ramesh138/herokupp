package com.hashmap.examples;

import java.util.HashMap;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		String str = "thisisjavablog";

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character charc = str.charAt(i);
			if (hashmap.containsKey(charc)) {
				int count = hashmap.get(charc);
				hashmap.put(charc, count + 1);
			} else {
				hashmap.put(charc, 1);
			}
		}
		System.out.println(hashmap);
	}

}
