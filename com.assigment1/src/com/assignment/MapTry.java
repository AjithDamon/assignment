package com.assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTry {

	public static void main(String[] args) {
		
		
		Map<Integer,String> m = new LinkedHashMap<>();
		
		
		
		m.put(001, "Ajith");
		m.put(002, "Vijay");
		m.put(003, "Surya");
		m.put(004, "Rajini");
		m.put(005, "Dhanush");
		
		m.replace(4, "Superstar");
		
		Map<Integer,String> m1 = new LinkedHashMap<>();
		
		m.put(006, "Ajith");
		m.put(007, "Vijay");
		m.put(8, "Surya");
		m.put(9, "Rajini");
		
		m.putAll(m1);
		
		System.out.println(m);
		System.out.println(m.get(4));
		
		
		
		System.out.println(m.size());
		
		System.out.println(m.keySet());
		
		System.out.println(m.values());
		
		Collection<String> values = m.values();
		
		for (String string : values) {
			
			System.out.println(string);
			
		}
		
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry);
			
		}
		
		

	}

}
