package com.interviewprep.TestPlayerCombo;

public class InvertTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.addNode(10);
		bst.addNode(20);
		bst.addNode(15);
		bst.addNode(30);
		bst.addNode(45);
		bst.addNode(50);
		bst.addNode(55);
		bst.printNodeInOrder(bst.root);
		
		invertTree(bst.root);
		System.out.println("After inverting..");
		//bst.printNodeInOrder(bst.root);
		
	}

	public static TreeNode invertTree(TreeNode root){
		if(root==null) return root;
		helper(root);
		return root;
	}
	
	public static void helper(TreeNode root){
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		System.out.println(root.data);
		if(root.left!=null) helper(root.left);
		if(root.right!=null) helper(root.right);
	}
}
