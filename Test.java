package com.shamim.Date;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N []=new int [15];
		int par []=new int [15];
		int impar []=new int [15];
		int par1=0, impar1=0;
		
		System.out.println("Enter number");
		for(int i=0; i<N.length; i++) {
			N[0]=sc.nextInt();
		}
		for(int i=0; i<N.length;i++) {
			if(N[i] % 2 ==0) {
				par[i]=N[i];
				par1++;
				if(par1==5) {
					
					break;
				}
			}else {
				impar[i]=N[i];
				impar1++;
				if(impar1==4) {
					
					break;
					
				}
			}
				
		}
		
		
		for(int i=0;i<par.length;i++) {
			System.out.println(par[i]);
		}
		
		
		
		
		
		
		
		
		
		
		//1179
		
//		   Scanner sc = new Scanner(System.in);
//	        int aux;
//	        System.out.println("hi");
//	        int[] N = new int[20];
//	        
//	        
//	        for(int i = 0; i<N.length;i++) {
//	        	
//	        	N[i]=sc.nextInt();
//	        		
//	        }
//	        System.out.println("SWAP");
//	        for (int i= 0 ; i<N.length/2 ; i++) {
//	        	aux=N[i];
//	        	N[i]=N[N.length - 1 - i];
//	        	N[N.length - 1 - i]=aux;
//	        	
//	        }        
//	        for( int i=0; i<N.length;i++) {
//	        	System.out.println("N["+i+"]"+" = " +N[i]);
//	        }
//        
//      
        
//        System.out.println(N.length);
//        for (int i=0; i < N.length; i++) {
//        	System.out.println("Enter the number "+i);
//            N[i] = sc.nextInt();
//        }
//        for (int i=0; i < (N.length / 2); i++) {
//        	aux = N[i];
//        	N[i] = N[N.length - 1- i];
//        	N[N.length - 1 -i] = aux;
//        }
//        for (int i=0; i < N.length; i++) {
//            System.out.println("N["+ i +"] = " + N[i]);
//        }
//		Scanner sc=new Scanner(System.in);
//		int [] N=new int [5];
//		int [] N2=new int [5];
//		for(int i=0;i<5;i++) {
//			N[i]=sc.nextInt();
//		}
//		
//		for(int i=0; i<5;i++) {
//			for(int j=5;j==0;j--) {
//				N2[j]=N[i];
//			}
//	}
//		
//		for(int i=0;i<5;i++) {
//			System.out.println("arr of N2 is "+N2[i]);
//		}
//		
		
		
//		int a,b,c;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a");
//		a=sc.nextInt();
//		b=sc.nextInt();
//		c=sc.nextInt();
//		
////		int result=(a+b+ Math.abs(a-b))/2;
////		int max=(result+c+Math.abs(result-c))/2;
////		System.out.println(max);
//		if(a>b && a>c) {
//			System.out.println(a+" eh o maior");
//		}else  if(b>c) {
//			System.out.println(b+" eh o maior");
//		}else {
//			System.out.println(c+" eh o maior");
//		}

	}

}
