package com.interviewprep.TestPlayerCombo;

import java.util.HashSet;
import java.util.Set;

public class CircularArrLoop {
/*
 * This is not fully completes
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,3,1,1,-4};//{1,3,1,1,-2};
		System.out.println(isCircularArray(intArray));;

	}

	public static boolean isCircularArray(int[] intArray){
		int prevIndex = 0;
		int currIndex = 0;
		Set<Integer> set = new HashSet<>();
		for(int i =0;i<intArray.length;i++){
			currIndex = getNextIndex(i,intArray);
			if(prevIndex == currIndex) return false;
			if(!set.add(currIndex)) return true;
		}
	
		return false;
	}
	
	public static int getNextIndex(int i,int[] intArray){
		int nextIndex = 0;
		if(i==0&&intArray[i]<0){
			//move backwards from first element
			nextIndex = intArray.length - intArray[i];
		}else if(i == intArray.length-1 &&intArray[i]>0){
			nextIndex = intArray[i]-1;
		}else nextIndex = intArray[i]+i;
		return nextIndex;
	}
}
