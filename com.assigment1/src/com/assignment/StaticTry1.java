package com.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StaticTry1 {

	
	
	
	

	public static void main(String[] args) {
		String s ="By the people for the people off the people";
		
		List<Object>s1 = new ArrayList<Object>();
		
		String[] split = s.split(" ");
		
		
		for (String string : split) {
			
			
			System.out.println(string);
			s1.add(string);
			
		}
		System.out.println(s1);
		System.out.println("=============================================");
		
		
		for(int i=0; i<s1.size(); i++) {
			
			
			for(int j=i+1; j<s1.size(); j++) {
				
				
				if(s1.get(i)==s1.get(j)) {System.out.println(s1.get(i));
					
				}
				
				
			}
		
			
		}
	
		

	}}


