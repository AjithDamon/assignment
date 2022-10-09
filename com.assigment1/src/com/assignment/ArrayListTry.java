package com.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<Object> list=new ArrayList<Object>();
		
		
		list.add("Ajith");
		list.add("Vijay");
		list.add("Rolex");
		list.add("Rolex");
		list.add(22);
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		System.out.println("length off the list: " +list.size());
		
		list.add(1, 94);
		System.out.println("After adding one more value size is: " +list.size());
		
		System.out.println(list);
		
		list.set(0, "ajith");
		System.out.println(list);
		
		
		System.out.println(list.getClass());
		
		System.out.println(list.get(1));
		
		System.out.println(list.contains("ajith"));
		
		List<Object> newlist=new ArrayList<Object>();
		
		newlist.add("Ajith");
		newlist.add("Vijay");
		newlist.add("Rolex");
		
		
	
		list.addAll(2, newlist);
		System.out.println(list);
		
		//USING FOR LOOP TO GET ALL ELEMENTS IN THE LIST NOW
		
		System.out.println("-----------------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------");
		//USING FOR EACH LOOP TO GET ALL ELEMENTS IN THE LIST NOW
		
		for (Object object: list) {
			
			System.out.println(object);
			
		}
		System.out.println("-----------------------------------------");
		//USING LIST ITERATOR AND WHILE - FORWWARD PRINT
		
		ListIterator<Object> listIterator = list.listIterator();
		
		while(listIterator.hasNext()) {
			
			System.out.println(listIterator.next());
		}
		System.out.println("-----------------------------------------");
		//USING LIST ITERATOR AND WHILE - REVERSE PRINT
		
				while(listIterator.hasPrevious()) {
					
					System.out.println(listIterator.previous());
				}
		

	}

}
