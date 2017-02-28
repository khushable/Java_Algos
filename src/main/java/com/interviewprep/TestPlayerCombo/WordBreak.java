package com.interviewprep.TestPlayerCombo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		// How many words in a dictionary can a given string be broken into??
		WordBreak wordB = new WordBreak();
		Set<String> dict = new HashSet<>();
		dict.add("leet");
		dict.add("code");
		dict.add("leets");
		dict.add("life");
		dict.add("is");
		dict.add("a");
		dict.add("challenge");
		wordB.workBreaker("leetcode",dict);
		wordB.workBreaker("lifeisachallenge", dict);

	}

	private  void workBreaker(String string, Set<String> dict) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		workBreak(string, dict,list);
		
	}

	public void workBreak(String s,Set<String> dict,List<String> list){
		for(int i = 0;i<=s.length();i++){
			if(dict.contains(s.substring(0, i))){
				if(i==s.length()-1){
					list.add(s.substring(0,i));
					return;
				}
				list.add(s.substring(0,i));
				workBreak(s.substring(i),dict,list);
			}
		}
		System.out.println("list size :"+list.size());
	}
}
