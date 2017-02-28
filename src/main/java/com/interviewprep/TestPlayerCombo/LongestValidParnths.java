package com.interviewprep.TestPlayerCombo;

import java.util.Stack;

public class LongestValidParnths {

	public static void main(String[] args) {
	//String s = "))(((()))))()";
		String s = " (())(()";
	LongestValidParnths longestP = new LongestValidParnths();
	System.out.println(longestP.countValidParenthesis(s));

	}

	public int countValidParenthesis(String s){
		int result = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c=='('){
				stack.push(c);
			}else {
				if(!stack.isEmpty()){
					if(stack.peek()=='('){
						stack.pop();
						result+=2;
					}
				}
			}
		}
		return result;
	}
}
