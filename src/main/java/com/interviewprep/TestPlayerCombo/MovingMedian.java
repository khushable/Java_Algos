package com.interviewprep.TestPlayerCombo;

import java.util.Collections;
import java.util.PriorityQueue;

public class MovingMedian {
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;
	
	MovingMedian(){
		minHeap = new PriorityQueue<>();
		maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	}
	public static void main(String[] args) {
		MovingMedian med = new MovingMedian();
		med.addNumber(50);
		med.addNumber(40);
		med.addNumber(45);
		System.out.println(med.findMedian());

	}

	public void addNumber(int num){
		maxHeap.offer(num);
		minHeap.offer(maxHeap.poll());
		
		if(maxHeap.size() < minHeap.size()) maxHeap.offer(minHeap.poll());
	}
	
	public double findMedian(){
		if(maxHeap.size()==minHeap.size()) return (maxHeap.poll() + minHeap.poll())/2;
		return maxHeap.poll();
	}
}
