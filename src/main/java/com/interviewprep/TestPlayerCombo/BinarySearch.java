package com.interviewprep.TestPlayerCombo;

public class BinarySearch {

	public static void main(String[] args) {
		int[]  nums = {10,20,30,40,50,60,75,80};
		System.out.println(binarySearch(nums, 65));
	}

	public static boolean binarySearch(int[] nums, int key){
		int i = 0;
		int j = nums.length-1;
		
		while(i<j){
			int mid = (i+j)/2;
			if(key == nums[mid]) return true;
			if(key>nums[mid]) i=mid+1;
			else j=mid-1;
			}
		
		return false;
	}
}
