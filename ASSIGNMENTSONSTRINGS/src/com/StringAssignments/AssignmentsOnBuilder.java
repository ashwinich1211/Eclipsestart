package com.StringAssignments;

public class AssignmentsOnBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb=new StringBuilder("AAssBBBjjjCCC");
String s = null;
for(int i=0;i<sb.length();i++)
{
	if(i%2!=0)
	{
	s=sb.toString().toLowerCase();
	}
	else
	{
		s=sb.toString().toUpperCase();
	}
	
}
System.out.println(s.toString());
sb.append("hai");
System.out.println(sb);
sb.insert(5, '$');
System.out.println(sb);
sb.reverse();
System.out.println(sb);
	}
}
