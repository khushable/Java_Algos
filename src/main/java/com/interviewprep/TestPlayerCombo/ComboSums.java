package com.interviewprep.TestPlayerCombo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComboSums {
public static void main(String...args){
	ComboSums cSums = new ComboSums();
	cSums.combinationSum(new int[]{2,5,20},20);
}

public List<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
	
	Set<Integer> set = new HashSet<>();
	for(int n: candidates){
		if(n<target)set.add(n);
	}
	int repeat = target;
	return comboSum(set,target,target);
	
}

private List<ArrayList<Integer>> comboSum(Set<Integer> set, int repeat,int target) {
	
	List<ArrayList<Integer>> mList = new ArrayList<ArrayList<Integer>>();

	for(int s:set){
		int loop = repeat;
		while(loop >=1){
			if(s*loop <= target){
				ArrayList<Integer> aList = new ArrayList<>(); 
				if(set.contains(target-(s*loop))){
					aList.add(target-(s*loop));
					//int recur = repeat;
					while(loop>=1){
						aList.add(s);loop--;
					}
				}else comboSum(set,target,target);
				if(!aList.isEmpty()) mList.add(aList);
			}loop--;			
		}
	}
	return mList;
}


}
