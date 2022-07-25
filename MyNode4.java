package com.shamim.Date;

import java.util.Scanner;

public class MyNode4 {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}}
		Node head=null;
		public void create() {
			int data, n;
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("Enter your data?");
				data=sc.nextInt();
				Node new_node=new Node(data);
				if(head==null) {
					head=new_node;
				}else {
					Node temp=head;
					while(temp.next !=null) {
						temp=new_node;
					}
					temp.next=new_node;
				}
				System.out.println("do you want moor? press 1");
				n=sc.nextInt();
			}while(n==1);
			
		}
		public void retraval() {
			Node temp=head;
			while(temp !=null) {
				System.out.println(temp.data);
				temp=temp.next;
				
			}
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode4 n=new MyNode4();
		n.create();
		n.retraval();

	}

}
