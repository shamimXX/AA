package com.shamim.Date;

import java.util.Scanner;

public class Stack1 {
	Scanner sc=new Scanner(System.in);
	
	int n=10;
	int top=-1;
	int [] a=new int[n];
	void push() {
		if(top == (n-1)) {
			System.out.println("overflow");
		}else {
			System.out.println("Enter data ");
			int i=sc.nextInt();
			top++;
			a[top]=i;
			System.out.println("item added");
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("underflow");
		}else {
			top--;
			System.out.println("item poped -> "+a[top]);
			System.out.println();
		}
	}
	void display() {
		for(int i=top; i>0;i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack1 s=new Stack1();
		s.push();
		s.push();
		s.display();
		s.pop();
		s.display();

	}

}
