package com.interviewprep.TestPlayerCombo;

import java.util.Stack;

public class BST {
	TreeNode root;
	public static void main(String args[]){
		BST bst = new BST();
		bst.addNode(30);
		bst.addNode(20);
		bst.addNode(50);
		bst.addNode(6);
		bst.addNode(29);
		bst.addNode(4);
		bst.addNode(14);
		bst.addNode(50);
		bst.addNode(45);
		bst.addNode(40);
		bst.addNode(49);
		bst.addNode(70);
		bst.addNode(66);
		bst.addNode(80);
		System.out.println(bst.findKthSmallestNode(5).data);
	}
	BST(){
		root = null;
	}
	void addNode(int data){
		TreeNode tNode = new TreeNode(data);
		if(root == null) {
			root = tNode;return;
		}
		insertRec(root,tNode);
	}
	
	void printNodeInOrder(TreeNode root){
		if(root==null) return;
		printNodeInOrder(root.left);
		System.out.println("Node - "+root.data);
		printNodeInOrder(root.right);
	}
	void insertRec(TreeNode currRoot, TreeNode node){
		if(node.data < currRoot.data){
			if(currRoot.left==null){
				currRoot.left = node; return;
			}else insertRec(currRoot.left,node);
		}else if(node.data > currRoot.data){
			if(currRoot.right==null){
				currRoot.right = node;return; 
			}else insertRec(currRoot.right,node);
		}
	}
	
	TreeNode findKthSmallestNode(int k){
		TreeNode node = root;
		Stack<TreeNode> stack = new Stack<>();
		int i =0;
		while(node!=null){
			stack.push(node);
			node = node.left;
		}
		while(!stack.isEmpty()){
			i++;
			if(i==k) return stack.pop();
			else {
				node = stack.pop();
				if(node.right!=null) stack.push(node.right);
			}
		}
		return null;
	}
	
}

class TreeNode<T>{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
	}
	
}
