package com.Generics;

public class Sorting {

	public static <T> int[] swap(int[] nums, int left, int right) {
		int temp = nums[right];
		nums[right] = nums[left];
		nums[left] = temp;
		return nums;
	}
}
