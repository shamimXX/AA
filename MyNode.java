package com.shamim.Date;

import java.util.Scanner;

public class MyNode {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void creation() {
		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your data ?");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
			} else {
				new_node.next = head;
				head = new_node;
			}
			System.out.println("Do u want to add more data? if Yes, press 1");
			n = sc.nextInt();
		} while (n == 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyNode mn = new MyNode();
		mn.creation();

	}

}
