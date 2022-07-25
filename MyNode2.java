package com.shamim.Date;

import java.util.Scanner;

public class MyNode2 {
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;}}
	
	Node head= null;
	
	public void create() {
		
		int data,n;
		do {
			System.out.println("Enter Your Data?");
		Scanner sc=new Scanner(System.in);
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(head == null) {
			head=new_node;
		}else {
			new_node.next=head;
			head=new_node;
			
		}
		System.out.println("do your want moor? press 1");
		n=sc.nextInt();
		}
		
		while(n==1);
		
		
	}
	
	public void reterval() {
		Node temp=head;
		if(head==null) {
			System.out.println("LL does not exist !");
		}else {
			while(temp !=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode2 no=new MyNode2();
		no.create();
		no.reterval();
	}

}
