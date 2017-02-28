package com.interviewprep.TestPlayerCombo;

public class SortedArrayToBST {

	public static void main(String[] args) {
		int[] nums = {30,35,40,60,70,90,95};
		SortedArrayToBST bst = new SortedArrayToBST();
		TreeNode root = bst.convertToBST(nums);
//		BST bSearchTree = new BST();
//		bSearchTree.printNodeInOrder(root);
	}

	public TreeNode convertToBST(int[] nums){
		if(nums.length==0) return  null;
		return convertArrayToBSTHelper(nums,0,nums.length-1);
	}

	private TreeNode convertArrayToBSTHelper(int[] nums, int start, int end) {
		if(start>end) return null;
		int mid = (start+end)/2;
		
		TreeNode root = new TreeNode(nums[mid]);
		System.out.println("root - "+root.data);
		root.left = convertArrayToBSTHelper(nums,start,mid-1);
		root.right = convertArrayToBSTHelper(nums,mid+1,end);
		
		return root;
	}
}
