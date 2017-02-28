package com.interviewprep.TestPlayerCombo;

public class LCA_BST {

	public static void main(String[] args) {
		int[] nums = {30,35,40,60,70,90,95};
		SortedArrayToBST sorted = new SortedArrayToBST();
		TreeNode root = sorted.convertToBST(nums);
		
		LCA_BST lca = new LCA_BST();
		System.out.println(lca.lowestComnAncestor(root, new TreeNode(40), new TreeNode(30)).data);

	}
	public TreeNode lowestComnAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(root.data > p.data && root.data> q.data)
			lowestComnAncestor(root.left, p, q);
		else if(root.data < p.data && root.data < q.data) lowestComnAncestor(root.right, p, q);
		return root;
	}
}
