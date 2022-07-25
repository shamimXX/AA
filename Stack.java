package com.shamim.Date;

import java.util.Scanner;

class Stack {
	int top = -1;
	int n = 10;
	int a[] = new int[n];
	Scanner sc = new Scanner(System.in);

	void push() {
		int j;

		if (top == (n - 1)) {
			System.out.println("Overflow");
		} else {
			do {
				System.out.println("Enter data");
				int i = sc.nextInt();
				top++;
				a[top] = i;
				System.out.println(i + " has inserted!");
				System.out.println("want moor? press 1");
				j = sc.nextInt();
			} while (j == 1);

		}
	}

	public void pop() {

		if (top == -1) {
			System.out.println("No data !");
		} else {
			top--;

			System.out.println("items deleted !");
		}

	}

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push();
		st.display();
		st.pop();
		st.display();

	}

}
