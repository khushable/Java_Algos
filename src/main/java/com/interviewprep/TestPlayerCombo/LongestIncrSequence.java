package com.interviewprep.TestPlayerCombo;

import java.util.ArrayList;
import java.util.List;

public class LongestIncrSequence {

	public static void main(String[] args) {
		LongestIncrSequence lis = new LongestIncrSequence();
		System.out.println(lis.longestIncSequence(new int[]{10,9,2,5,3,7,101,18}));

	}
	public int longestIncSequence(int[] nums){
		List<Integer> list = new ArrayList<>();
		for(int num : nums){
			if(list.size()==0) list.add(num);
			if(num > list.get(list.size()-1)) list.add(num);
			else {
				int i =0;
				int j = list.size()-1;
				while(i<j){
					int mid = (i+j)/2;
					if(list.get(mid)<num) i = mid+1;
					else j= mid;					
				}
				list.set(j, num);
			}
		}
		return list.size();
	}
}
