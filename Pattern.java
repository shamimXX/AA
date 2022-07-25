package com.shamim.Date;

import java.util.Scanner;

public class Pattern {
	static void swap(int arr[] , int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void waveSort(int arr[], int n) {
		for(int i=1;i<n; i+=2) {
			if(arr[i] > arr[i-1]) {
				swap(arr,i,i-1);
			}
			if(arr[i] > arr[i+1] && i <=n-2) {
				swap(arr,i,i+1);
			}
		}
			
		
		
	}
	
//	public static int Lsearch(int arr[],int n, int key) {
//		
//		for(int i=0; i<n; i++) {
//			if(arr[i]== key) {
//				return i;
//			}
//		}
//		return -1;
//	
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(j);
			}
			System.out.print("-> "+i+" ->");
		}
		
//		int a=5, b=6;
//		System.out.println(a & b);
//		int A=2;
//		System.out.println(A >> 2);
		
//		int arr[]= {1,3,4,7,5,6,2};
//		waveSort(arr,7);
//		for(int i=0;i<7;i++) {
//			System.out.print(arr[i]);
//		}
//		
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n=sc.nextInt();
//		
//		
//		
//		int arr[]=new int [n];
//		System.out.println("Enter array elements");
//		for(int i=0; i<n; i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		for(int i=0; i<n-1; i++) {
//			for(int j=i+1; j<n;j++) {
//				if(arr[j] < arr[i]) {
//					int temp=arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
//				
//			}
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int c=0,  beg=0,end,mid;;
//		
//		System.out.println("how many elements you want?");
//		int n=sc.nextInt();
//		
//		
//		int m []=new int [n];
//		System.out.println("Enter your data !");
//		for(int i=0; i<n;i++) {
//			m[i]=sc.nextInt();
//		}
//		System.out.println("Enter item to find?");
//		int item=sc.nextInt();
//		end=n-1;
//		while(beg<=end) {
//			mid=(beg+end)/2;
//			if(item==m[mid]) {
//				c++;
//			
//				break;
//			}else if(item >m[mid]) {
//				
//				beg=mid+1;
//				
//			}else if(item <m[mid]) {
//				end=mid-1;
//				
//			}
//			
//		}
		
		
//		for ( int i=0; i<m.length; i++) {
//			if(m[i]== item) {
//				c++;
//				System.out.println("index is "+i+" and value is "+m[i]);
//				break;
//			}
//		}
//		
//		if(c>0) {
//			System.out.println("item exist");
//		}else {
//			System.out.println("item not exist !");
//		}
//		
//		
//		
//		
		
		
		
//		System.out.println("Enter number");
//		int N=sc.nextInt();
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		

//		System.out.println("Enter number");
//		int N2=sc.nextInt();
//		for(int i=N2;i>0;i--) {
//			for(int j=0;j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("enter");
//		int N2 = sc.nextInt();
//		
//		for (int i = 1; i<=N2; i++) {
//			for (int j = 1; j <=N2; j++) {
//				if (i == 1 || j == 1 || i==N2 || j == N2) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

	}

}
