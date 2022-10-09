package com.programs;

public class CountOfDigits {

	public static void main(String[] args) {

		int num = 1234567893;

		int temp = num;
		int count = 0;

		while (num > 0) {

			int rem = num % 10;
			count++;
			num = num / 10;

		}
		System.out.println("count of digits of no " + temp + " is " + count);
	}

}
