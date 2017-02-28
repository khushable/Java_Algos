package com.interviewprep.TestPlayerCombo;

public class BestTimeToBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int bestTimetoBuyStocks(int[] nums){
		int buy = nums[0];
		int sell = nums[0];
		for(int num:nums){
			buy = Math.min(buy, num);
			sell = Math.max(num-buy, sell);
		}
		return sell;
	}
}
