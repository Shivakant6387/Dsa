package com.springcore001.DSA;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,2,1};
		int ans[]=plusOne(arr);
		System.out.println(Arrays.toString(ans));

	}
	static int[] plusOne(int arr[]) {
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}
			arr[i]=0;
		}
		int [] newNumber=new int[n+1];
		newNumber[0]=1;
		return newNumber;
	}

}
