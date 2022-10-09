package com.assignment;

public class Return {

	
	public int add(int a, int b) {
		return a+b;
		
	}
	

	public static void main(String[] args) {
		
		Return r = new Return();
		int add = r.add(1, 2);
		System.out.println(add);
		
		

	}

}
