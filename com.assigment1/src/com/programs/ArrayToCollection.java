package com.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayToCollection {

	public static void main(String[] args) {
		
		String arr[]= {"ajith", "vijay", "surya","rajini"};
		
		Set<String> s= new LinkedHashSet();
		
		for (String string : arr) {
			
			s.add(string);
			
		}
		
		System.out.println(s);

	}

}
