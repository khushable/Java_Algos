package com.interviewprep.TestPlayerCombo;

public class BalancedBinaryTree {
	
	public static void main(String[] args) {
		BST bst = new BST();
		bst.addNode(30);
		bst.addNode(40);
		bst.addNode(50);
		bst.addNode(70);
		bst.addNode(80);
		bst.addNode(60);
		BalancedBinaryTree bbinaryTree = new BalancedBinaryTree();
		//Unbalanced binary search tree
		System.out.println(bbinaryTree.isBalanced(bst.root));
		
		int[] nums = {30,35,40,60,70,90,95};
		SortedArrayToBST sorted = new SortedArrayToBST();
		TreeNode root = sorted.convertToBST(nums);
		//Balanced binary search tree
		System.out.println(bbinaryTree.isBalanced(root));
		
	}

	public boolean isBalanced(TreeNode root){
		return (Math.abs(minDepth(root) - maxDepth(root))<2);
	}
	
	private int minDepth(TreeNode root){
		if(root==null) return 0;
		return 1+Math.min(minDepth(root.left),minDepth(root.right));
	}
	
	private int maxDepth(TreeNode root){
		if(root==null) return 0;
		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}
	
}
