package com.interviewprep.TestPlayerCombo;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArrSum(nums));
	}

	public static int maxSubArrSum(int[] nums){
		int max = Integer.MIN_VALUE;
		int newsum = nums[0];
		for(int i = 1;i<nums.length;i++){
			if(newsum + nums[i]<nums[i]) newsum = nums[i];
			else newsum+=nums[i];
			max=Math.max(newsum, max);
		}
		return max;
	}
}
