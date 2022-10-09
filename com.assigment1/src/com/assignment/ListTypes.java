package com.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTypes {

	public static void main(String[] args) {
        List <Object> l=new ArrayList<Object>();   //Creating 1st Object
        
       l.add("Ajith");
       l.add(23);
       l.add(99.23);
       l.add("DQ");
       l.add("Ajith");
       System.out.println("ARRAY LIST");
       System.out.println(l);
       
       l.set(1, "Raj");
       System.out.println(l);
       
       Object get=l.get(1);
       System.out.println(get);
       
       Object index= l.indexOf(99.23);
       System.out.println(index);
       
       Object contains=l.contains("Vijay");
       System.out.println(contains);
       
       System.out.println(l.contains("Ajith"));
       
       System.out.println(l.remove(4));
       System.out.println(l);
       
      // l.clear();
       System.out.println(l);
       System.out.println("__________________________________________________");
       System.out.println("LINKED LIST");
       
       List <Object> li=new LinkedList<Object>(); //Creating 2nd Object
       
       li.add("Vijay");
       li.add("Rolex");
       li.add(1994);
       li.add(99.45);
       
       System.out.println(li);
       l.addAll(li);
       System.out.println(l);
       
       
       l.removeAll(li);
       System.out.println(l);
       
       l.retainAll(li);
       System.out.println(l);
       
       
   
       
      
      
       
       

	}

}
