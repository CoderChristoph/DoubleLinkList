package com.oop.dll;

public class DoubleLinkList {
	public Node head;
	public Node tail;
	private int count = 0;
	private boolean doesExist = false;
	
	public DoubleLinkList() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			count++;
			return;
		}
		
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
        count++;
	}
	
	public void printValuesForward() {
		Node current = this.head;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void printValuesBackward() {
		Node current = this.tail;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.previous;
		}
	}
	
	public Node pop() {
		Node current = this.tail;
		Node runner = this.tail;
			
		runner = runner.previous;
		this.tail = runner;
		this.tail.next = null;
		this.count--;
		return current;
	}
	
	public boolean contains(Integer value) {
		Node front = this.head;
		Node back = this.tail;
		
		while(front != back) {
			if (front.value == value || back.value == value) {
				this.doesExist = true;
				return this.doesExist;
			}
			front = front.next;
			back = back.previous;
 		}
		
		if (front == back && front.value == value || back.value == value) {
			this.doesExist = true;
			return this.doesExist;
		}
		
		return this.doesExist;
	}
	
	public int size() {return this.count;}
	
	public void insertAt(Node newNode, int indx) {
		Node front = this.head.next; 
		Node follower = this.head;
		indx = indx - 1;

		while(front != this.tail) {
			if (indx == 0) {
				newNode.next = front;
				front.previous = newNode;
				newNode.previous = follower;
				follower.next = newNode;
				return;
			}
			follower = follower.next;
			front = front.next;
			indx--;
		}
	}
	
	public Node removeAt(int indx) {
		Node current = this.head.next;
		Node follower = this.head;
		indx = indx-1;
		while (current != this.tail) {
			if(indx == 0) {
				Node temp = current;
				current = current.next;
				current.previous = follower;
				follower.next = current;
				return temp;
			}
			current = current.next;
			follower = follower.next;
			indx--;
		}
		return null;
	}
	
	public boolean isPalindrome() {
		Node front = this.head;
		Node back = this.tail;
		
		while(front != back) {
			if (front.value == back.value) {
				front = front.next;
				back = back.previous;
			} else {
				return false;
			}
		}
		
		return true;
	}
}
