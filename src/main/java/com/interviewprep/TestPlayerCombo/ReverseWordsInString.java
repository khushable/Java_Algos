package com.interviewprep.TestPlayerCombo;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("the sky is blue"));

	}

	public static String reverseWords(String s){
		String[] sArray = s.split(" ");
		StringBuilder sb = new StringBuilder();
//		for(int i = sArray.length-1;i>=0;i--){
//			sb.append(sArray[i]).append(" ");
//		}
		
		for(int i = s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				sb.append(s.substring(i+1,s.length()-sb.length())).append(" ");
			}
		}
		sb.append(s.substring(0,s.length()-sb.length()));
		return sb.toString();
	}
}
