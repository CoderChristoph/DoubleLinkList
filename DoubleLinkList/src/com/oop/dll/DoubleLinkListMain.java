package com.oop.dll;

public class DoubleLinkListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkList dll = new DoubleLinkList();
		Node n5 = new Node(5);
		Node n1 = new Node(10);
		Node n2 = new Node(15);
		Node n6 = new Node(10);
		Node n3 = new Node(5);
//		Node n4 = new Node(25);
		dll.push(n5);
		dll.push(n1);
		dll.push(n2);
		dll.push(n6);
		dll.push(n3);
		
		System.out.println(dll.isPalindrome());
		
	}

}
