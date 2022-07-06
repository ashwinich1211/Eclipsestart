package com.practice2;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int FirstNumber = s.nextInt();
		System.out.println("First Number:" + FirstNumber);
		int SecondNumber = s.nextInt();
		System.out.println("Second Number:" + SecondNumber);

		try {
			int Display = (FirstNumber / SecondNumber);
			System.out.println(Display);
		}

		catch (ArithmeticException e) {

			System.out.println("trying to divide by zero");
		} finally {
			s.close();
			System.out.println("bye");
		}
	}

}
