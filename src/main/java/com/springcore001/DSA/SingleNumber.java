package com.springcore001.DSA;

public class SingleNumber {
	static int singleNumber(int arr[],int n) {
		int single=0 ,flog=0;
		for(int i=0;i<n;i++) {
			flog=0;
			single=arr[i];
			for(int j=0;j<n;j++) {
				if((arr[j]==single)&& (j!=i)) {
					flog=1;
				}
			}
			if(flog==0) {
				return single;
			}
			
		}
		return single;
	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,5,2,1,3};
		int n=arr.length;
		System.out.println(singleNumber(arr,n));
	}
}
