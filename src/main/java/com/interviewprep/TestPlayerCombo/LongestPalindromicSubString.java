package com.interviewprep.TestPlayerCombo;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubString palin = new LongestPalindromicSubString();
		System.out.println(palin.palindromeSubString("babaa"));
	}

	public String palindromeSubString(String s){

		if(s == null) return null;
		
		if(s.length()==1) return s;
		String longestP = s.substring(0,1);
		for(int i = 0;i<s.length();i++){
			String temp = palindromeHelper(s,i,i);
			System.out.println("temp1 : "+temp);
			if(temp.length() > longestP.length()) longestP = temp;
			
			temp = palindromeHelper(s,i,i+1);
			System.out.println("temp2 : "+temp);
			if(temp.length() > longestP.length()) longestP = temp;
		}
		return longestP;
	}

	private String  palindromeHelper(String s, int begin, int end) {

		while(begin>=0 && end <= s.length()-1 && (s.charAt(begin)==s.charAt(end))){
			begin--;
			end++;
		}
		return s.substring(1+begin, end);
	}
}
