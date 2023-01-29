package com.springcore001.DSA;

public class RemoveDuplicatesFromSortedArray {
	static int removeDublicates(int arr[],int n) {
		if(n==0 || n==1)
		return n;
		int [] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
			if(arr[i]!=arr[i+1])
				temp[j++]=arr[i];
		for(int i=0;i<j;i++)
			arr[i]=temp[i];
		return j;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4,4,5,5,8,8};
		int n=arr.length;
		n=removeDublicates(arr,n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}

}
