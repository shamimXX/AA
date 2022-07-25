package com.shamim.Date;

import java.util.Scanner;

public class Queue {

	public class queue {
		int f = -1, r = -1;
		int n = 10;
		int[] q = new int[n];

		void enpueue(Scanner sc) {
			if (r == (n - 1)) {
				System.out.println("overflow condition");
			} else {
			System.out.println("Enter yor data");
			int i=sc.nextInt();
			if(f==-1 && r==-1) {
				f=0;
				r=0;
				q[r]=i;
				
			}
			
			
			
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	}

}
