package Datastructure.LinkedList.SinglyList;

import Datastructure.LinkedList.SinglyList.RemoveDuplicateFromSortedLinkdedList.Node;

public class InsertElementInSortedLinkedList {
	private Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void insertElemntInSortedLinkedList(int data) {
		Node NewNode = new Node(data);
		Node curr = head;
		Node temp = null;
		while(curr!=null && curr.data<NewNode.data) {
			temp = curr;
			curr = curr.next;
		}
		NewNode.next= curr;
		temp.next = NewNode;
	}
	
	public static void main(String args[]) {
		InsertElementInSortedLinkedList obj = new InsertElementInSortedLinkedList();
		
		obj.head = new Node(10);
		Node second =  new Node(20);
		Node third = new Node(20);
		Node forth = new Node(40);
		Node fifth = new Node(50);
		
		obj.head.next = second;
		second.next = third;
		third.next =  forth;
		forth.next = fifth;
		
		obj.insertElemntInSortedLinkedList(15);
		obj.display();
		
		
	}
}
