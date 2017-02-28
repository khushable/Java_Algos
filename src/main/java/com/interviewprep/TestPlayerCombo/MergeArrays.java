package com.interviewprep.TestPlayerCombo;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[6];
		A[0]=10;A[1]=14;
		int[] B = {1,2,3,15};
		mergeArrays(2,4,A,B);
	}

	public static void mergeArrays(int m , int n, int[] A, int[] B){
		int i = m -1;
		int j = n -1;
		int k = m+n-1;
		
		while(k>=0){
			if(i>0 &&j>0){
				if(A[i]>B[j]){
					A[k--] = A[i--];
				}else{
					A[k--] = B[j--];
				}
				
			}else{
				
				if(i==0) A[k--] = A[i--];
				else if(j==0) A[k--] = B[j--];
				
				else if(i<0) A[k--]=B[j--];
				else if(j<0) A[k--]=A[i--];
			}
		}
		System.out.println(A.length);
	}
}
