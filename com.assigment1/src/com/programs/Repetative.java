package com.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Repetative {

	public static void main(String[] args) {
		
		
		String s ="Selenium testing automation testing mobile testing";
		
		String[] s1 = s.split(" ");
		
		Map<String,Integer> m = new HashMap<String, Integer>();
		for (String word : s1) {
			
			
			
			if(m.containsKey(word)) {
				
				Integer value = m.get(word);
				
				m.put(word, value+1);
				
			}
			else {
			m.put(word, 1);}
			
		}
		
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			
			
			if(entry.getValue()>1)
			
			System.out.println(entry);
			
		}

	}

}
