package com.interviewprep.TestPlayerCombo;

public class LongestComSubString {

	public static void main(String[] args) {
		LongestComSubString lcSub = new LongestComSubString();
		System.out.println(lcSub.longestCommonSubString("abcd", "abde"));

	}
	public int longestCommonSubString(String a, String b){
		int m = a.length();
		int n = b.length();
		int[][] dp = new int[m][n];
		int max =0;
		for(int i = 0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a.charAt(i)==b.charAt(j)){
					if(i==0 ||j==0){
						dp[i][j]=1;
					}else dp[i][j]=1+dp[i-1][j-1];
					
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		return max;
	}

}
