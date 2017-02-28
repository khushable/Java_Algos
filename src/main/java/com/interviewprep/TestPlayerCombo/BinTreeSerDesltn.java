package com.interviewprep.TestPlayerCombo;

import java.io.SerializablePermission;
import java.util.LinkedList;
import java.util.Queue;

public class BinTreeSerDesltn {
	
	StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Lamp is on the table";
		String[] strArray = s.split(" ");		
		BinTreeSerDesltn bTreeSerDer = new BinTreeSerDesltn();
		StringNode root = bTreeSerDer.populateTree(strArray,0, strArray.length-1);
		System.out.println(bTreeSerDer.serializePreOrder(root));
	}

	public String serialize(StringNode n){
		
		return null;
	}
	
	public StringNode deserialize(String s){
		String[] strArray = s.split(" ");					
		return populateTree(strArray,0,strArray.length-1);
	}

	private StringNode populateTree(String[] strArray, int start, int end) {
		if(start>end) return null;
		
		int mid = (start + end)/2;
		StringNode root = new StringNode(strArray[mid]);
		System.out.println("Root - "+root.data);
		root.left = populateTree(strArray,start,mid-1); 
		root.right = populateTree(strArray,mid+1,end);		
		return root;
		
		
		
	}
	
	String serializePreOrder(StringNode root){
		
		if(root==null) return sb.toString();
		sb.append(root.data).append(" ");
		if(root.left!=null) serializePreOrder(root.left);
		if(root.right!=null) serializePreOrder(root.right);
		
		return sb.toString();
	}
	
	StringNode populateTreePreOrder(String[] sArray){
		StringNode root = new StringNode(sArray[0]);
		Queue<String> queue = new LinkedList<>();
		
		
		return null;
	}
}
class StringNode{
	String data;
	StringNode right;
	StringNode left;
	
	StringNode(String data){
		this.data = data;		
	}
}