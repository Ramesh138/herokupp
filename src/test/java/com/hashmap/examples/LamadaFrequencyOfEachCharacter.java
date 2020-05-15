package com.hashmap.examples;

import java.util.HashMap;

public class LamadaFrequencyOfEachCharacter {
	public static void main(String[] args) {
		String str = "thisisjavablog";

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character charc = str.charAt(i);
			/*
			 * hashmap.computeIfPresent(charc, (character, count) -> count + 1);
			 * hashmap.computeIfAbsent(charc, (character) -> 1);
			 */
		}
		System.out.println(hashmap);
	}
}
