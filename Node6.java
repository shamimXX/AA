package com.shamim.Date;

import java.util.Scanner;

public class Node6 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void create() {
		int data,n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your data?");
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null) {
				head=new_node;
			}else {
				Node temp=head;
				while(temp.next != null) {
					temp=temp.next;
				}
				temp.next=new_node;
			}
			System.out.println("do you want moor? press 1");
			n=sc.nextInt();
		}while(n==1);
	}
	public void retrival() {
		Node temp=head;
		while(temp != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node6 n=new Node6();
		n.create();
		n.retrival();

	}

}
