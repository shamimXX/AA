package com.shamim.Date;

import java.util.Scanner;

import com.shamim.Date.Node5.Node;

public class Link {
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
		
		Node head=null;
		public void insert() {
			int data,n;
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("Enter your data?");
				data=sc.nextInt();
				Node new_node=new Node(data);
				if(head == null) {
					head=new_node;
				}else {
					new_node.next=head;
					head=new_node;
				}				
				System.out.println("want moor press 1");
				n=sc.nextInt();
			}while( n == 1);
		}
		public void print() {
			Node temp=head;
			while(temp !=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Link l=new Link();
		l.insert();
		l.print();
	}

}
