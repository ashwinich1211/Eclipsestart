package com.StringAssignments;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java string pool refers to collections of strings which are stored in heap memory";
		s="jjj";
		System.out.println("String in lowercase:" + s.toLowerCase());
		System.out.println("String in UpperCase:" + s.toUpperCase());
		System.out.println("String to replace:" + s.replace('a', '$'));
		System.out.println("check word contain:" + s.contains("collections"));
		System.out
				.println(s.equals("Java String Pool Refers To Collections Of Strings Which Are Stored In Heap Memory"));
		System.out.println(s.equalsIgnoreCase(s));
	}

}
