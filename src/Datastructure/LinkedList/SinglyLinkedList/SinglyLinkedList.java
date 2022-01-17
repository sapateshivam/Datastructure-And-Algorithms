package Datastructure.LinkedList.SinglyLinkedList;


public class SinglyLinkedList {
	private Node head;

	private static class Node {
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

	public void lenthOfLinkedList() {
		Node current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		System.out.println("The lengh of linkedList :"+count);
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);
		
		sl.head.next=second;
		second.next=third;
		third.next=forth;
		
		sl.display();
		sl.lenthOfLinkedList();
	}
}
