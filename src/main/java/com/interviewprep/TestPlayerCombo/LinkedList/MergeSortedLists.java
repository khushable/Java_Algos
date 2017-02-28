package com.interviewprep.TestPlayerCombo.LinkedList;

public class MergeSortedLists {

	public static void main(String[] args) {
		
		MergeSortedLists mList = new MergeSortedLists();
		// TODO Auto-generated method stub
		MiddleNode l1 = new MiddleNode();
		l1.addNode(11);
		l1.addNode(9);
		l1.addNode(7);
		l1.addNode(4);
		l1.addNode(1);
		
		MiddleNode l2 = new MiddleNode();
		l2.addNode(15);
		l2.addNode(13);
		l2.addNode(7);
		l2.addNode(3);
		l2.addNode(2);
		
		//l1.printNodes();
		//l2.printNodes();
		
		mList.mergedList(l1.head, l2.head);
		
	}

	public Node mergedList(Node n1,Node n2){
		if(n1==null) return n2;
		if(n2 == null) return n1;
		Node head = new Node(0);
		Node p = head;
		while(n1!=null && n2!=null){
		if(n1.data <=n2.data) {
			p.next = n1;
			n1 = n1.next;
		}else {
			p.next = n2;
			n2 = n2.next;
		}
		p = p.next;
		}
		
		if(n1==null) p.next = n2;
		else if(n2==null) p.next = n1; 
		Node q = head;
		while(q!=null){
			System.out.println("Node is "+q.data);
			q = q.next;
		}
		return head.next;
	}
	
}
