package com.hashmap.examples;

import java.util.HashMap;

public class hashmapexample1 {
	
	public static void main(String[] args) {
		
sample("SIVA");
		
	}
	
	public static void sample(String name) {
		
	HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		hashmap.put(name, 1);
		
		hashmap.put("Suresh", 2);
		
		hashmap.put("Mahesh", 3);
		
		hashmap.put("Selvaraj", 4);
		
		System.out.println("Values are displaying as  : "+hashmap);
		
		System.out.println("value to be display as    : "+hashmap.get("Suresh"));
		
		System.out.println("Value to be display as    : "+hashmap.values());
		
		System.out.println("Value to be display as    :"+hashmap.containsKey("Suresh") );
		
		System.out.println("Value to be display as    :"+hashmap.entrySet());
		
		System.out.println("Value to be display as    :"+hashmap.clone());
		
		hashmap.put("team1",hashmap.get("Suresh")+1);
		
		System.out.println(hashmap);
		
		HashMap<String,Integer> teamGoalMap=new HashMap<String,Integer>();
		teamGoalMap.put("team1",1);
		teamGoalMap.put("team2",1);
		
		System.out.println(teamGoalMap);
		
		teamGoalMap.put("team2",teamGoalMap.get("team1")+1);
		
		System.out.println(teamGoalMap);
		
		
	}

}
