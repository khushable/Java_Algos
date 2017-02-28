package com.interviewprep.TestPlayerCombo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
	Interval int1 = new Interval(1,3);
	Interval int2 = new Interval(2,6);
	Interval int3 = new Interval(8,10);
	Interval int4 = new Interval(15,18);
	
	List<Interval> intervalList = Arrays.asList(new Interval[]{int1,int2,int3,int4});
	System.out.println(mergeIntervals(intervalList));

	}
	
	static List<Interval> mergeIntervals(List<Interval> intervalList){
		Collections.sort(intervalList);
		List<Interval> mergeList = new ArrayList<>();
		Interval prev = intervalList.get(0);
		for(Interval intrvl : intervalList){
			if( intrvl.start > prev.end){
				mergeList.add(intrvl);
				prev = intrvl;
			}else{
				Interval newInterval = new Interval(prev.start,Math.max(prev.end, intrvl.end));
				prev = newInterval;
			}
		}
		mergeList.add(prev);
		return mergeList;
	}

}

class Interval implements Comparable{
	int start;
	int end;
	
	Interval(int start,int end){
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Object o) {
		Interval anotherInt = (Interval)o;
		return this.start-anotherInt.start;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
	
}
