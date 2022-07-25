package com.shamim.Date;

import java.util.Scanner;

public class CurcuLL {
	
	
	static class Node{
		int data,n;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	Node head=null;
	Node tail=null;
	
	public void insert() {
		int data,n;
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your data?");
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(head== null) {
			head=new_node;
			tail=new_node;
			new_node.next=head;
		}else {
			
			new_node.next=head;
			head=new_node;
			tail.next=head;
		}
			System.out.println("do your want moor, press 1: ");
			n=sc.nextInt();
		}while(n==1);
	}
	
	public void treversal() {
		Node temp=head;
		if(head ==null) {
			System.out.println("ll does not exist!");
		}else {
			
		
			 do {
				System.out.println(temp.data);
				temp=temp.next;
				
			}while(temp != head);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurcuLL c=new CurcuLL();
		c.insert();
		c.treversal();
	}

}
