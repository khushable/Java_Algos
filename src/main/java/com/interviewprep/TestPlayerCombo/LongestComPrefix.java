package com.interviewprep.TestPlayerCombo;

public class LongestComPrefix {

	public static void main(String[] args) {
		String[] arrays = {"leetcode","leets","leeway","leet"};
		System.out.println(longestComPref(arrays));

	}

	public static String longestComPref(String[] arrays){
		//Find min length string
		StringBuffer sb = new StringBuffer();
		sb.append(arrays[0]);
		for(String s:arrays){
			if(s.length() < sb.length()){
				sb.setLength(0);
				sb.append(s);
			}
		}

		for(String s:arrays){
			for(int i=0;i<sb.length();i++){
				if(s.charAt(i)!=sb.charAt(i)){
					sb.deleteCharAt(i);
				}
			}
		}
		return sb.toString();
	}
}
