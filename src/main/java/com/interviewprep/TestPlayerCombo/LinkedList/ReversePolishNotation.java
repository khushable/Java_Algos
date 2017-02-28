package com.interviewprep.TestPlayerCombo.LinkedList;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[]{"4", "13", "5", "/", "+"};
		System.out.println(reversePolish(s));
	}

	public static int reversePolish(String[] s){
		String ops = "+-*/";
		Stack<Integer> stack = new Stack<>();
		for(String str:s){
			if(!ops.contains(str)){
				try{
					stack.push(Integer.parseInt(str));					
				}catch(NumberFormatException e){
					return 0;
				}
			}else{
				int a = stack.pop();
				int b = stack.pop();
				switch (str) {
				case "*":
					stack.push(b*a);
					break;

				case "/":
					stack.push(b/a);
					break;

				case "+":
					stack.push(b+a);
					break;
				case "-":
					stack.push(b-a);
					break;
					
				default:
					break;
				}
				
			}
			
		}
		return stack.pop();
	}
}

enum Operations{
	MULTIPLY("*"),DIVIDE("/"),ADD("+"),SUBTRACT("-");
	private String operator;
	
	Operations(String operator){
		this.operator = operator;
	}
	
	public String getOperator(){
		return operator;
	}
}