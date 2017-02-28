package com.interviewprep.TestPlayerCombo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

public class IsomorphicStrings {
	public static void main(String...strings){
		System.out.println(isIsomorphic("egg", "add"));;
		System.out.println(isIsomorphic("foo", "bar"));;
		System.out.println(isIsomorphic("abd", "cde"));;
	}
	private static boolean isIsomorphic(String s1, String s2){
		if(StringUtils.isEmpty(s1) || StringUtils.isEmpty(s2)) return false;
		if(s1.length() !=s2.length()) return false;
		Map<Character,Character> charMap = new HashMap<>();
		char c1,c2;
		for(int i=0;i<s1.length();i++){
			c1 = s1.charAt(i);
			c2 = s2.charAt(i);
			if(charMap.containsKey(c1)){
				if(charMap.get(c1)!=c2) return false;
			}else {
				if(charMap.containsValue(c2)) return false;
				charMap.put(c1, c2);
			}
		}
		
		return true;
	}
}
