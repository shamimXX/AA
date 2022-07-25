package com.shamim.Date;

import java.util.Scanner;

public class SinkLinkList {
	
	static class Node{
		int data;
		Node next;
		
		public Node() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
	}
	Node head=null;
	Node tail=null;
			
	
	public void insert() {
		int data,i;
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your data");
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head == null) {
				head=new_node;
				tail=new_node;
				new_node.next=head;
			}else {
				new_node.next=head;
				head=new_node;
				tail.next=head;			
			}
			
			
			
			System.out.println("do  your want moor, press 1");
			i=sc.nextInt();
		}while(i==1);
		
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
		
		SinkLinkList ll=new SinkLinkList();
		ll.insert();
		ll.trevarsal();
		
		
	}

}
