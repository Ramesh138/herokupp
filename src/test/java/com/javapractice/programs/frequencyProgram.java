package com.javapractice.programs;

import java.util.HashMap;

public class frequencyProgram {
	public static void main(String[] args) {
		
		HashMap<Character, Integer> hMap= new HashMap<Character, Integer>();
		
		String sentance=" this is my  name Ramesh Darling";
		
		for (int i = 0; i < sentance.length(); i++) {
			
			Character c=sentance.charAt(i);
			
			if(hMap.containsKey(c)) {
				hMap.put(c, hMap.get(c)+1);
			}else {
				hMap.put(c, 1);
			}
		}
		System.out.println(hMap);
	}

}
