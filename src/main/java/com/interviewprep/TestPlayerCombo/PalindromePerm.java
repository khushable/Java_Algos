package com.interviewprep.TestPlayerCombo;

import java.util.HashMap;
import java.util.Map;

public class PalindromePerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbb";
		System.out.println(isPalindromePerm(s.toCharArray()));
	}

	public static boolean isPalindromePerm(char[] charArray){
		
		Map<Character,Integer> map = new HashMap<>();
		int cnt = 0; int counter=0;
		for(Character c : charArray){
			if(!map.containsKey(c)){
				map.put(c,1);
			}else{
				cnt = map.get(c);
				map.put(c, ++cnt);
			}
		}
		int oddCount=0;
		for(Map.Entry<Character,Integer> entry:map.entrySet()){
			if(entry.getValue()%2!=0){
				//there should be atmost 1 odd number of entries
				oddCount++;
			}
			if(oddCount > 1)return false;
		}
		return true;
	}
}
