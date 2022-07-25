package com.shamim.Date;

public class PatterP {
	public static void printNum(int n) {
		
		if(n==0) {
			return ;
		}else {
			System.out.println(n);
			printNum(n-1);
		}
		
	}
	
	public static void printNum1(int n) {
	
		if(n==6) {
			return;
		}else {
			System.out.println(n);
			printNum1(n+1);
		}
		
	}
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		
		
//		printNum(5);
//		printNum1(10);
		
		
		
		
		
		
		
		

//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=n; j++) {
//				System.out.println();
//				
//			}
//		}
		
//		
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			for(int j=i; j>=1; j--) {
//				System.out.print(j);
//			}
//			
//			for(int j=2;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		
//		for (int i = 1; i <= n; i++) {
//
//			for (int j=1; j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for (int j=1; j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			
//			System.out.println();
//		}

//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			
//			for(int j=1; j<=n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		

//		for(int i=1; i<=n; i++) {
//			for (int j=1; j<=i; j++) {
//				
//				System.out.print("*");
//			}
//			int spaces=2*(n-i);
//			for (int j=1; j<=spaces; j++) {
//				
//				System.out.print(" ");
//			}
//		
//			
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			
//			
//			//second part		
//		}
//		for(int i=n; i>=1; i--) {
//			for (int j=1; j<=i; j++) {
//				
//				System.out.print("*");
//			}
//			int spaces=2*(n-i);
//			for (int j=1; j<=spaces; j++) {
//				
//				System.out.print(" ");
//			}
//		
//			
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			
//			
//			//second part		
//		}

//		for (int i=1; i<=n; i++) {
//			
//			for(int j=1; j<=i; j++) {
//				int sum=i+j;
//				if(sum % 2 ==0) {
//					System.out.print("1");
//				}
//				else {
//					System.out.print("0");
//				}
//				
//			}
//			System.out.println();
//		}
//		

//		int count=1;
//		for ( int i=1; i<=n; i++) {
//			for (int j=1; j<=i; j++) {
//				
//				System.out.print(count++ +" ");
//			}
//			System.out.println();
//		}

//		for (int i=1; i<=n; i++) {
//			for ( int j=1; j<=n-i+1; j++) {
//				System.out.print(j);
//			}System.out.println();
//		}
//		
//		

//		for(int i=1; i<=n;i++) {
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n - i; j++) {
////				System.out.print(" ");
//				System.out.print("j");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//

	}

}
