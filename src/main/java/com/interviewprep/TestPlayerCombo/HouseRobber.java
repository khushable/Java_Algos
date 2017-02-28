package com.interviewprep.TestPlayerCombo;

public class HouseRobber {

	public static void main(String[] args) {
		HouseRobber rob = new HouseRobber();
		int nums[]={50,1,100,50};
		System.out.println(rob.maxMoneyRob(nums));

	}
	
	public int maxMoneyRob(int[] nums){
		int even = 0;
		int odd = 0;
		
		for(int i =0;i<nums.length;i++){
			if(i%2==0){
				even+=nums[i];
				even = even>odd?even:odd;
			}else{
				odd+=nums[i];
				odd= even>odd?even:odd;
			}
		}
		return even = even>odd?even:odd;
	}
}
