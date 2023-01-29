package com.springcore001.DSA;

import java.util.HashSet;

public class ContainDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,5,3,4,3,5,6};
		if(checkDuplicate(arr,3))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	static boolean checkDuplicate(int arr[],int n) {
		HashSet<Integer>set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i]))
				return true;
			set.add(arr[i]);
			if(i>=n)
				set.remove(arr[i-n]);
		}
		return false;
	}

}
