package com.Generics;

public class Example {
	public static void main(String args[])
	{
	int arr[]= {1,1,2,2,3,4,5,6,7,7,7,1,8,10};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=1;j<i;j++)
		{
			if(arr[i]==arr[j])
				
					{
				System.out.println(arr[j]);
			
					}
			}
		}
}
}
