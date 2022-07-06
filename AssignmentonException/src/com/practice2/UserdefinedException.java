package com.practice2;

class UserDefined extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefined(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}

}

public class UserdefinedException {

	public static void main(String[] args) throws UserDefined {
		// TODO Auto-generated method stub
		try {
			throw new UserDefined("hello error");
		} catch (UserDefined ud) {
			ud.printStackTrace();
		} finally {
			System.out.println("haii");
		}
	}
}
