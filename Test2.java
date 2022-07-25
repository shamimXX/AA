package com.shamim.Date;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N,M,fib=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			M=sc.nextInt();
			for(int j=1;j<=M;j++) {
				fib*=j;
				System.out.println(fib);
			}
			
			
		}
		
		
		
		//1153
//		int f=0,Fi=0;
//		if(N>0 && N<13) {
//			for(int i=N-1;i>0;i--) {
//			f+=N*i;
//			Fi+=f;
//				
//			}
//			System.out.println(f);
//		}
//		
		
		
		
		//1151
//		System.out.println("Enter N");
//		N=sc.nextInt();
//		int n1=0,n2=1,n3;
//		if(N>0 && N<46) {
//			
//			System.out.print(n1+" "+n2);
//			for(int i=2;i<N;i++) {
//				n3=n1+n2;
//				System.out.print(" "+n3);
//				n1=n2;
//				n2=n3;
//				
//			}
//			System.out.println();
//			
////			if(N==0 && N==1) {
////				System.out.println("1");
////			}else {
////				
////			}
//		}

	}

}
