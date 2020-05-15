package com.javapractice.programs;

import java.util.HashMap;

public class frequancy2 {

	public static void main(String[] args) {
		String sentence = " this is Ramesh trying very hard to prove";

		HashMap<String, Integer> hMap = new HashMap<String, Integer>();

		/*
		 * for (int i = 0; i < sentence.length(); i++) { Character c =
		 * sentence.charAt(i); if (hMap.containsKey(c)) {
		 * 
		 * hMap.put(c, hMap.get(c) + 1); } else { hMap.put(c, 1); }
		 * 
		 * } System.out.println(hMap);
		 * 
		 */
		/*
		 * String sent[] = sentence.split(" "); for (int i = 0; i < sent.length; i++) {
		 * 
		 * String value = sent[i];
		 * 
		 * if (hMap.containsValue(value)) { hMap.put(value, hMap.get(value) + 1);
		 * 
		 * } else { hMap.put(value, 1); }
		 * 
		 * }
		 * 
		 * System.out.println(hMap);
		 */
	}

}
