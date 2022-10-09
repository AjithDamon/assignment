package com.assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	
	


	public static void main(String[] args) {
		
		
		
		
		
		
		Map <String, Integer> m=new HashMap<>();
		
		m.put("Ajith", 1994);
		m.put("Ajith", 1995);
		m.put("Rajan", 1964);
		m.put("Ganga", 1967);
		m.put("Arya", 1997);
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println("Size of map:"+size);
		
		Set<String>ref=m.keySet();  //TO PRINT KEY ALONE
		System.out.println(ref);
		
		Collection<Integer> values = m.values(); //TO PRINT VALUE ALONE
		System.out.println(values);
		
		boolean containsKey = m.containsKey("Ajith");
		System.out.println(containsKey);
		
        boolean containsValue = m.containsValue(1994);
        System.out.println(containsValue);
        
        Set<Entry<String, Integer>> entrySet = m.entrySet(); //THIS IS TO PRINT ALL ENTRIES SEPERATELY
        for (Entry<String, Integer> entry : entrySet) {
        	System.out.println(entry);
			
		}
		
		
		

	}

}
