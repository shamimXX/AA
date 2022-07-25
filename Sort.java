package com.shamim.Date;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println(arr.length);
		System.out.println("Enter your data?");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// insertion sort
		int val, j;
		for (int i = 1; i < 6; i++) {
			val = arr[i];
			j = i - 1;
			while (val < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
				if (j == -1) {
					break;
				}
			}
			arr[j + 1] = val;

		}

		// bubble sort
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<6-i-1;j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//				
//			}
//		} 

		// selection sort
//		for(int i=0; i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[0] > arr[j]) {
//					int temp=arr[0];
//					arr[0]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//	 	
//		

		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}

	}

}
