package com.shamim.Date;

import java.util.Scanner;

import com.shamim.Date.SinkLinkList.Node;

public class LLInsertMiddle {

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
	Node tail = null;

	public void insert() {

		int data;
		int i;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your data?");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
				tail = head;
				tail.next = head;
			} else {
				tail.next = new_node;
				tail = new_node;
				new_node.next = head;

//			while(temp.next!=null) {
//				temp=temp.next;
//			}
//			tail=temp;
//			tail.next=head;
//		}
			}
			System.out.println("do your want moor, press 1");
			i=sc.nextInt();
		} while (i == 1);
	}
	public void trevarsal() {
		Node temp=head;
		do {
			if(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}while(temp!=head);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLInsertMiddle l=new LLInsertMiddle();
		l.insert();
		l.trevarsal();

	}

}
