package com.practice2;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "  " + "Fuzz");

			}
			if (i % 5 == 0) {
				System.out.println(i + "Bizz");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "FuzzBizz");
			}
		}

	}

}
