package com.interviewprep.TestPlayerCombo;

public class StringReversal {
	public static void main(String args[]){
		StringReversal strRever = new StringReversal();
		System.out.println(strRever.reverseIterative("GOOD"));
		System.out.println(strRever.reverseRecursive("HOMBRES"));
	}
	
	String reverseIterative(String str){
		char[] charArray = str.toCharArray();
		StringBuilder strBuilder = new StringBuilder(); 
		for(int i=charArray.length-1;i>=0;i--){
			strBuilder.append(charArray[i]);
		}
		return strBuilder.toString();
	}
	
	String reverseRecursive(String str){
		if(str.length()<2) return str;
		return reverseRecursive(str.substring(1))+str.charAt(0);

	}
}
