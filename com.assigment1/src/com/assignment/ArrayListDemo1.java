package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		List<Object> al=new ArrayList<Object>();
		
		al.add(100);
		al.add("Welcome");
		al.add("Fucker");
		al.add(99);
		al.add(10.99);
		
		System.out.println(al);
		
		al.get(2);
		System.out.println(al.get(2));
		
		al.add(2, "Mother");
		System.out.println(al);
		
		int ind=al.indexOf("Mother");
		System.out.println(ind);
		
		List<Object>al_dup=new ArrayList<Object>();
		
al_dup.add("Suck");
		al_dup.add("Fck");
		al_dup.add("Duck");
		al_dup.add("Fuck");
		al_dup.add("Suck");
		
	al.addAll(al_dup);
		System.out.println(al);
	}
}
