package com.interviewprep.TestPlayerCombo;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7};		
		reverseArray(array,11);
		System.out.println(Arrays.toString(array));
	}

	public static void reverseArray(int[] array, int order){
		if(order > array.length) order = order % array.length;
		
		int splitIndex = array.length -order;
		
		reverse(array,0,splitIndex-1);
		reverse(array,splitIndex,array.length-1);
		reverse(array,0,array.length-1);
		
		
	}
	
	public static void reverse(int[] array, int start, int end){
		if(start>end) return;
		while(start<end){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;end--;
		}
	}
}
