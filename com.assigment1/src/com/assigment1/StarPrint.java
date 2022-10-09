package com.assigment1;

public class StarPrint {

	
	public static void main(String[] args) {
		
		for(int i=5; i>=5; i--) {
			
			for(int j=i; j<=5; j++) {
				
				System.out.print(" ");
			}
            for(int j=1,p=5; j<i; j++,p--) {
				
				System.out.print(p);
			}
			
          for(int j=1,p=5; j<=i; j++,p--) {
				
				System.out.print(p);
		}
			
			
			System.out.println();
		}
		

	}

}
