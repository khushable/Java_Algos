package com.interviewprep.TestPlayerCombo;

import java.util.ArrayList;
import java.util.List;

public class Pascal3Angle {

	public static void main(String[] args) {
		getPascalTriangle(5);

	}
	
	public static ArrayList<ArrayList<Integer>> getPascalTriangle(int numOfRows){
		ArrayList<ArrayList<Integer>>  listOfLists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> intList1 = new ArrayList<>();
		intList1.add(1);
		listOfLists.add(intList1);
//		ArrayList<Integer> intList2 = new ArrayList<>();
//		intList2.add(1);
//		intList2.add(1);
//		listOfLists.add(intList2);
		ArrayList<Integer> prevList = null;
		ArrayList<Integer> intList = null;
		for(int i =1;i<numOfRows;i++){
			intList = new ArrayList<>();
			prevList = listOfLists.get(i-1);
			intList.add(1);
			for(int j=0;j<prevList.size()-1;j++){
				intList.add(prevList.get(j)+prevList.get(j+1));
			}
				
			intList.add(1);
			listOfLists.add(intList);			
		}

		return listOfLists;
	}

}
