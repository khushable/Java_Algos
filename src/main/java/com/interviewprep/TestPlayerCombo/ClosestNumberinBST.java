package com.interviewprep.TestPlayerCombo;

public class ClosestNumberinBST {
	int goal;
	double min = Double.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.addNode(50);
		bst.addNode(90);
		bst.addNode(25);
		bst.addNode(15);
		bst.addNode(29);
		bst.addNode(10);
		bst.addNode(20);
		bst.addNode(40);
		bst.addNode(35);
		ClosestNumberinBST closest = new ClosestNumberinBST();
		System.out.println(closest.getClosestNumber(bst.root, 29));

	}

	public  int getClosestNumber(TreeNode root,int target){
		closestNumber(root, target);
		return goal;
	}
	
	public  void closestNumber(TreeNode root,double target){
		System.out.println("root is "+root.data);
		if(root == null) return;
		if(Math.abs(root.data-target)==0){
			goal = root.data;
			return;
		}
		if(Math.abs(root.data-target)<min){
			min = Math.abs(root.data-target);
			goal = root.data;
		}
		
		if(target < root.data)closestNumber(root.left, target);
		else closestNumber(root.right,target);
		}
	
}
