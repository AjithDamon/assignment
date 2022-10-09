package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayAscendingOrder {
	
	int a[]= {9,8,7,6,5,4,3,2,1};
	
	Integer b[]= {2,2,4,5,6,7,7,8,9,9};
	
	int c[]= {2,2,4,5,6,7,7,8,9,9};
	
	
	
	
	
      public void ascending() {
		
    	//TO PRINT IN ASCENDING ORDER  
    	  Arrays.sort(a);
    	  
    	  for(int i=0; i<a.length; i++) {
    		  
    		  
    		  System.out.print(a[i]);
    		  
    		  
    	  }

    	  
    	  //TO FING THIRD LARGEST NO IN ARRAY AFTER SORTING
    	  
    	  System.out.println(a[a.length-3]);
	}
      
	
	
	public void toRemoveDuplicates() {
		//COLLECTION METHOD
		List<Integer> l = Arrays.asList(b);
		//System.out.println(l);
		Set<Integer> s = new TreeSet<>();
		
		s.addAll(l);
		
		System.out.println("After removing Duplicates: " +s);

		
		// LOOP METHOD
		
		
		for(int i=0; i<c.length; i++) {
			
			for(int j=i+1; j<c.length; j++) {
				
				if(c[i]==c[j]) {
					
					
					
					System.out.println(c[j]);
				}
				
				
				
			}
			
			
			
			
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		ArrayAscendingOrder a = new ArrayAscendingOrder();
		
		a.ascending();
		a.toRemoveDuplicates();

	}

}
