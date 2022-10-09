package com.assignment;

public class StringAndStrinBuffer {

	public static void main(String[] args) {
		
		
		
		
		//immutable String
		

		
//				String s4 = "Java";
//				String s5 = "Program";
//			
//				System.out.println(System.identityHashCode(s4));
//				System.out.println(System.identityHashCode(s5));
//				
//				s4 = s4.concat(s5);
//				
//				System.out.println(s4);
////				
//				System.out.println(System.identityHashCode(s4));
//				
//				
				System.out.println("**************************************************");
				
//				
				//mutable String
				StringBuilder s6 = new StringBuilder("Java");
				StringBuilder s7 = new StringBuilder("Program");
				
				System.out.println(System.identityHashCode(s6));
				System.out.println(System.identityHashCode(s7));
				
				s6 = s6.append(s7);
				
				System.out.println(System.identityHashCode(s6));



	}

}
