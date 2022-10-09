package com.assigment1;

public class Return {

	
	
	public int toTryReturn(int a , int b) {
		
		
		 a =5;
		 b=5;
		 
		 int c= a+b;
		 System.out.println(c);
		 return c;

	}
	public static void main(String[] args) {

Return r = new Return();
int tryReturn = r.toTryReturn(4, 4);

System.out.println(tryReturn);


	}

}
