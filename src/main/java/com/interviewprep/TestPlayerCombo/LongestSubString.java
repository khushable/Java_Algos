package com.interviewprep.TestPlayerCombo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		System.out.println(longestSubString("abcdefgabcbbvwxyz"));
	}

	public static int longestSubString(String str){
		Set<Character> set = new HashSet<>();
		char c; int subStrLength = 0;int max=0;
		for(int i = 0;i<str.length();i++){
			c = str.charAt(i);
			if(set.contains(c)){
				max = Math.max(max, subStrLength);
				subStrLength=0;
			}else {
				set.add(c);
				subStrLength++;
			}
		}
		return Math.max(max, subStrLength);
	}
	
	
}
