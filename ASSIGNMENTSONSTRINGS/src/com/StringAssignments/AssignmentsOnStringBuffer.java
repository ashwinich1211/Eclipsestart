package com.StringAssignments;

public class AssignmentsOnStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b = new StringBuffer("StringBuffers");
		System.out.println(b);
		b.append(" is a peer class of String");
		System.out.println(b);
		b.append(" that Provides much of");
		System.out.println(b);
		b.append(" the functionality of strings");
		b.insert(90, "in is used to _at specified position");
		System.out.println(b);
		StringBuffer b1=new StringBuffer("the method is used to reverse String");
		b1.reverse();
		System.out.println(b1);
	}

}
