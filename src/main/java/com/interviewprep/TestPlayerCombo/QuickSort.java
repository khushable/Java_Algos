package com.interviewprep.TestPlayerCombo;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort quickS = new QuickSort();
		quickS.quickSortHelper(new int[]{9,2,4,7,3,7,10});
	}

	public void quickSortHelper(int[] x){
		int low = 0; int high = x.length-1;
		quickSortOnne(x,low,high);
		System.out.println(Arrays.toString(x));
				
	}
	
	public void quickSortOnne(int[] x,int low, int high){
		if(x==null || x.length == 0) return;
		if(low >=high) return;
		
		
		int middle = low+(high-low)/2;
		int pivot = x[middle];
		int i = low;int j = high;
		while(i<=j){
			while(x[i]<pivot)i++;
			while(x[j]>pivot)j--;
			if(i<=j) {
				int temp = x[i];
				x[i]=x[j];
				x[j]=temp;i++;j--;
			}
		}
		quickSortOnne(x,low,j);
		quickSortOnne(x,i,high);
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		
			quickSort(arr, low, j);
 
		
			quickSort(arr, i, high);
	}
}
