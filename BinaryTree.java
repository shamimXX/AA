package com.shamim.Date;

import java.util.Scanner;

public class BinaryTree {

	static Node create() {
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter value");
		int data = sc.nextInt();
		if (data == -1) 
			return null;
		
		root = new Node(data);
		System.out.println("Enter left child of " + root);
		root.left = create();
		System.out.println("Enter right child of " + root);
		root.right = create();

		return root;
	}
	static void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);  
		inorder(root.right);
		System.out.println(root.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = create();
		inorder(root);
//		
	}

}

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
		
	}

	@Override
	public String toString() {
		return "" + data;
	}
}