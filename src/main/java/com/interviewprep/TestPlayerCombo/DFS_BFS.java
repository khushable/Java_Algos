package com.interviewprep.TestPlayerCombo;

import java.util.LinkedList;
import java.util.Queue;

public class DFS_BFS {

	public static void main(String[] args) {
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		GraphNode n6 = new GraphNode(6);
		GraphNode n7 = new GraphNode(7);
		
		n1.neighbors = new GraphNode[] {n2, n4, n5};
        n2.neighbors = new GraphNode[] {n1, n3, n4};
        n3.neighbors = new GraphNode[] {n2, n4, n7};
        n4.neighbors = new GraphNode[] {n1, n2, n3, n5, n6, n7};
        n5.neighbors = new GraphNode[] {n1, n4, n6};
        n6.neighbors = new GraphNode[] {n4, n5, n7};
        n7.neighbors = new GraphNode[] {n3, n4, n6};
        
        DFS_BFS obj = new DFS_BFS();
       // System.out.println("DFS results");
        //obj.dfsRecursive(n1);
        System.out.println("BFS results");
        obj.bfs(n1);
		
			}

	public void dfsRecursive(GraphNode node){
		System.out.println(node);
		node.visited = true;
		for(GraphNode n : node.neighbors){
			if(!n.visited) dfsRecursive(n);
		}
	}
	
	public void bfs(GraphNode node){
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		node.visited = true;
		queue.add(node);
		while(!queue.isEmpty()){
			GraphNode v = queue.poll();
		for(GraphNode n:v.neighbors){
			if(!n.visited) {
				System.out.println(n);
				n.visited = true;
				queue.add(n);
			}
		}
	}
}
}

class GraphNode{
	int data;
	GraphNode[] neighbors;
	boolean visited;
	
	GraphNode(int data){
		this.data = data;
		this.visited = false;
	}

	@Override
	public String toString() {
		return "GraphNode [data=" + data + "]";
	}

	
	
}
