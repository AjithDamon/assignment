package com.assignment;

public class ImmutableAndMutable {

	public static void main(String[] args) {

		String s = "Ajith";
		String s1 = "Ajith";
		String s2 = "Raj";

//--------------------------------------------------------------------------------------------------------------		
		System.out.println("LITERAL STRING IS IMMUTABLE");

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		String concat = s.concat(s2);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));

		s = s + s2;
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
//------------------------------------------------------------------------------------------------------------
		System.out.println("==============================================================");
		System.out.println("==============================================================");
		System.out.println("NON LITERAL STRING IS IMMUTABLE TOO");
		String st = new String("Ajith");
		String st1 = new String("Ajith");
		String st2 = new String("Raj");

		System.out.println(System.identityHashCode(st));
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));

		String concat2 = st.concat(st2);
		System.out.println(concat2);
		System.out.println(System.identityHashCode(concat2));

		st = st + st2;
		System.out.println(st);
		System.out.println(System.identityHashCode(st));
//-------------------------------------------------------------------------------------------------------------
		System.out.println("==============================================================");
		System.out.println("==============================================================");

		System.out.println("STRINGBUFFER IS MUTABLE");
		StringBuffer sb = new StringBuffer("Ajith");
		StringBuffer sb1 = new StringBuffer("Ajith");
		StringBuffer sb2 = new StringBuffer("Raj");

		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));

		StringBuffer append = sb.append(sb2);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		StringBuffer append2 = sb1.append(sb2);
		System.out.println(append2);
		System.out.println(System.identityHashCode(append2));

	}

}
