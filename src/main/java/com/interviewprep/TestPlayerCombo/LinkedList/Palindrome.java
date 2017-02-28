package com.interviewprep.TestPlayerCombo.LinkedList;

import java.util.Stack;

public class Palindrome {
	Node head;
	Palindrome(){
		head = null;
	}
	public static void main(String args[]){
		Palindrome palin =  new Palindrome();
		palin.addNode(1);
		palin.addNode(2);
		palin.addNode(3);
		palin.addNode(2);
		palin.addNode(1);
		System.out.println(palin.isPalindrome(palin.head));
	}
	void addNode(int data){
		if(head==null) {
			head = new Node(data);
			return;
		}else {
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
	}
	public  boolean isPalindrome(Node head){
		Node slow = head;
		Node fast = head;
		
		Stack<Integer> stack = new Stack<>();
		while(fast!=null && fast.next!=null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		//Odd Number list..skip middle element
		if(fast!=null) slow = slow.next;
		
		while(slow!=null){
			int top = stack.pop().intValue();
			if(top!=slow.data) return false;
			slow = slow.next;
		}
		
		return true;
	}
	
	public  int findLoopStarts(Node head){
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) break;
		}
		slow = head;
		while(slow!=null){
			if(slow.data == fast.data) break;
			slow = slow.next;
		}
		return fast.data;
	}
	
}
