
package com.springcore001.DSA;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,0,5,6,7,0,8,9};
		int n=arr.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				Swap(arr,j,i);
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"");
		}

	}
	static void Swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
