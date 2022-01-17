package Datastructure.LinkedList.SinglyLinkedList;

public class ReverseSinglyLinkedList {
	private Node head;
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void reverseLinkedList() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void display() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+"-->");
			curr= curr.next;
		}
		System.out.print("null");
	}
	
	
	public static void main(String args[]) {
		
		ReverseSinglyLinkedList obj = new ReverseSinglyLinkedList();
		
		obj.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		
		obj.head.next = second;
		second.next = third;
		third.next = fourth;
		
		obj.reverseLinkedList();
		obj.display();
		
		
		
		
	}

}
