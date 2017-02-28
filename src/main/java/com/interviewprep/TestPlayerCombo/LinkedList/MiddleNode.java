package com.interviewprep.TestPlayerCombo.LinkedList;

public class MiddleNode {
	 Node head;
	MiddleNode(){
		head = null;
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
	
	void printNodes(){
		if(head ==null) return;
		Node currentNode = head;
		System.out.println("Printing...");
		while(currentNode!=null){
			System.out.println("Current Node = "+currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	Node findMiddleNode(){
		if(head==null) return null;
		Node currentNode = head;
		Node prevNode = head;
		while(currentNode!=null){
			System.out.println("Current Node in while -"+currentNode.data);			
			currentNode = currentNode.next;
			if(currentNode!=null && currentNode.next!=null){
				prevNode = prevNode.next;
				currentNode = currentNode.next;
			}
	}
		return prevNode;
	}
	public static void main(String args[]){
		MiddleNode midNode = new MiddleNode();
		midNode.addNode(5);
		midNode.addNode(7);
		midNode.addNode(7);
		midNode.addNode(12);
		midNode.addNode(20);
		midNode.printNodes();
		//System.out.println(midNode.findMiddleNode().data);
		midNode.reverseList(midNode.head);
		System.out.println("After reversal...");
		midNode.printNodes();
		//midNode.removeNodesOfValN(7);
		//midNode.removeDuplicateNodes();
		//midNode.findKthNodefromLast(2);
		System.out.println("2nd Node from  last is "+midNode.findKthNodefromLast(2).data);
		System.out.println("After removal...");
		midNode.printNodes();		
		System.out.println(midNode.findNthNode(2).data);
	}
	
	 Node reverseList(Node node){
		if(node==null || node.next==null){
			head=node;
			return head;
		}
		Node remaining = reverseList(node.next);
		node.next.next=node;
		node.next=null;
		return remaining;
	}
	 
	 Node findNthNode(int n){
		 Node prevNode = head;
		 Node currNode = head;
		 //Move current node to nth node
		 for(int i=0;i<n;i++) currNode = currNode.next;
		 while(currNode!=null){
			 currNode = currNode.next;
			 prevNode = prevNode.next;
		 }
		 return prevNode;
	 }
	 
	 Node removeNodesOfValN(int val){
		 if(head!=null && head.data == val) head = head.next;
		 Node curr = head;
		 while(curr!=null && curr.next!=null){
			 if(curr.next.data == val) curr.next = curr.next.next;
			 else curr = curr.next;
		 }
		 return head;
	 }

	 Node removeDuplicateNodes(){
		 if(head!=null && head.data == head.next.data) head = head.next;
		 Node curr = head;
		 while(curr!=null && curr.next!=null){
			 if(curr.next.data == curr.data) curr.next = curr.next.next;
			 else curr = curr.next;
		 }
		 return head;
	 }

	 Node removeAnyDuplicates(){
		 if(head!=null && head.data == head.next.data) head = head.next;
		 Node curr = head;
		 Node prev = head;
		 while(curr!=null && curr.next!=null){
			 if(curr.next.data == curr.data){
				 prev = curr;
				 
			 }
		 }
		 return head;
	 }
	 
	 Node findKthNodefromLast(int k){
		//last node is k =1, second last is k =2
		 Node p1 = head;Node p2 = head;
		 for(int i =0;i<k;i++){
			 p2 = p2.next;
		 }
		 if(p2==null) return null;
		 while(p2.next!=null){
			 p1 = p1.next;
			 p2=p2.next;
		 }
		 
		 return p1;
		
	 }
}
class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
