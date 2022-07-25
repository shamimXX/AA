package com.shamim.Date;

import java.util.Scanner;

public class MyNode3 {
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

	public void create() {
		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your data? ");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
			}else {
//				new_node.next=head;
				new_node.next=new_node;
//				head=new_node;
				
			}  
			System.out.println("do you want moor? press 1:");

			n = sc.nextInt();
		} while (n == 1);

	}
	public void retrival() {
		Node temp=head;
		if(temp==null) {
			System.out.println("no data");
		}else {
			while(temp !=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNode3 n=new MyNode3();
		n.create();
		n.retrival();

	}

}
