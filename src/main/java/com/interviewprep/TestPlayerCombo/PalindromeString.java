package com.interviewprep.TestPlayerCombo;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabaaa";
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s){
		int slen = s.length()-1;
		for(int i=0;i<s.length();i++){
			if(i>=(s.length()/2)+1) break;
			if(s.charAt(i)!=s.charAt(slen-i)) return false;
		}
		return true;
	}
}
