package com.interviewprep.TestPlayerCombo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.
Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */



public class LongestValidParenthesis {
	public static void main(String...strings){
		//String s = ")()())";
		String s = "()()((())()()()";
		//String s= "())";
		Stack<int[]> stack = new Stack<>();
		char[] cArray = s.toCharArray();
		int stackCount = 0;
		int count = 0;
		int max=0;
		char prev = 'e';
		int mid = 0;
		for(char ch:cArray){
			if(ch =='(' && prev == ')'){
				mid = Math.max(count,stackCount);
				max = Math.max(mid, max);
				//count = 0;
				stackCount =0;
				stack.empty();
				System.out.println("Max count in if "+max);
			}
			if(ch=='(') stack.push(new int[]{1,0});
			else{
				if(!stack.isEmpty()){
					stack.pop();				
					if(stack.size()>0) stackCount +=2;
					else count+=2;
				}
			}
			prev = ch;
			max=Math.max(count, max);
		}
		if(stack.isEmpty()) max+=stackCount;
		System.out.println("Max is "+max);
	}
	
}
