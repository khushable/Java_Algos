package com.interviewprep.TestPlayerCombo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongConsecutiveSeq {

	public static void main(String[] args) {
		//int[] array = new int[]{100,4,200,1,3,2};
		int[] array = new int[]{1,5,6,7,19,25,100,101,102,103,104,105,106};
		//System.out.println(findLongestSequenceCount(array));
		System.out.println(findLongestSeq(array));

	}
	public static int findLongestSequenceCount(int[] array){
		Set<Integer> set = new TreeSet<>();
		for(int i :array){
			set.add(i);
		}
	int max=0;	
		//Iterate through HashSet until sequence is broken
	for(int i : array){
		
		int count = 1;
		//int left = i-1;
		int right = i+1;
		
		while(set.contains(right)){
			count++;
			set.remove(i);
			right++;
		}
		max = Math.max(count,max);
		
	}
	for(int i : set){
	}
		return max;
	}
	
	public static int findLongestSeq(int[] array){
		int maxCount = 0;int count = 0; 
		Set<Integer> set = new LinkedHashSet<>();
		for(int i : array){
			set.add(i);
		}
		int prev = 0;
		if(set.size()==0) return 0;

		Iterator<Integer> itr = set.iterator();
		prev = itr.next();
		for(int i : set){
			if(i == prev+1) count++;
			else{
				maxCount = Math.max(maxCount, count);
				count = 0;
			}
			prev = i;
		}
		return Math.max(maxCount, count);
	}
    }
