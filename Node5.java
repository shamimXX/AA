package com.shamim.Date;

import java.util.Scanner;

public class Node5 {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void create() {
		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your data");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
			} else {
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = new_node;
			}
			System.out.println("do you want moor? press 1");
			n = sc.nextInt();
		} while (n == 1);

	}

	public void retrivat() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
			System.out.println();
		}

	}
//	public void Bdelet() {
//		System.out.println("Deleting data !");
//		Node temp=head;
//		temp=temp.next;
//		head=temp;
//		System.out.println();
//	}
//	public void Edelet() {
//		System.out.println("Deleting from the end !");
//		Node temp=head;
//		Node  ptr=temp.next;
//		while(ptr.next !=null) {
//			temp=ptr;
//			ptr=temp.next;
//		}
//		temp.next=null;
//		System.out.println();
//	}
	
	
	
	public void BD() {
		Node temp=head;
		temp=temp.next;
		head=temp;
		System.out.println("this is end! of BD");
	}
	
	public void DE() {
		Node temp=head;
		Node ptr=temp.next;
		while(ptr.next !=null) {
			temp=ptr;
			ptr=ptr.next;
		}
		temp.next=null;
		System.out.println("Delete from end");
	}
	
	public void DI(int x) {
		System.out.println("deleting from location");
		Node temp=head;
		Node ptr=temp.next;
		for(int i=0; i<x;i++) {
			temp=ptr;
			ptr=ptr.next;
		}
		temp.next=ptr.next;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node5 n = new Node5();
		
		
		
		
		n.create();
//		n.retrivat();
//		n.Bdelet();
//		n.retrivat();
//		n.Edelet();
		n.retrivat();
//		
//		n.BD();
//		n.retrivat();
//		n.DE();
//		n.retrivat();
		n.DI(1);
		n.retrivat();

	}

}
