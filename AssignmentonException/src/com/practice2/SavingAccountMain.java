package com.practice2;

import java.util.Scanner;

class InsufficienBalance extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Message;

	public InsufficienBalance(String Message) {
		// TODO Auto-generated constructor stub
		this.Message = Message;
	}

	@Override
	public String toString() {
		return "InsufficienBalance [Message=" + Message + "]";
	}
}

public class SavingAccountMain {

	public static void main(String[] args) throws InsufficienBalance {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		try {
			if (n <= 0) {
				throw new InsufficienBalance("enter valid amount");
			} else {
				System.out.println("please withdraw amount");
			}
		} catch (InsufficienBalance e) {
			e.printStackTrace();
		}

	}

}
