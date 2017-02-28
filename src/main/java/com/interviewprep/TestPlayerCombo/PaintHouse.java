package com.interviewprep.TestPlayerCombo;

import java.util.Arrays;
import java.util.Random;

public class PaintHouse {

	public static void main(String[] args) {
		PaintHouse paint = new PaintHouse();
		// TODO Auto-generated method stub
		int[][] costs = new int[3][3];
		
		int m = costs.length;
		int n = costs[0].length;
		
		for(int i=0;i<costs.length;i++){
			for(int j =0;j<costs[i].length;j++){
				costs[i][j]=(int)(Math.random()*10);
			}
		}
		
		//System.out.println(Arrays.deepToString(costs));
		for(int i=0;i<costs.length;i++){
			for(int j =0;j<costs[i].length;j++){
				System.out.print(costs[i][j]+" ,");
			}
			System.out.println();
		}
		System.out.println(paint.minCost(costs));
		
	}

	public int minCost(int[][] costs){
		for(int i =1;i<costs.length;i++){
			costs[i][0]+=Math.min(costs[i-1][1],costs[i-1][2]);
			costs[i][1]+=Math.min(costs[i-1][0],costs[i-1][2]);
			costs[i][2]+=Math.min(costs[i-1][0],costs[i-1][1]);			
		}
		int m = costs.length-1;
		
		return Math.min(Math.min(costs[m][0], costs[m][1]), costs[m][2]);
	}
}
