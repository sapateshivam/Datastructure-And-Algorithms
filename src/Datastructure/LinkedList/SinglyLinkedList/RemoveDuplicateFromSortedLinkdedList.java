package Datastructure.LinkedList.SinglyLinkedList;


public class RemoveDuplicateFromSortedLinkdedList {

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
	
	public void RemoveDuplicateSortedEle() {
		Node curr = head;
		while(curr!=null && curr.next!=null) {
			if(curr.data==curr.next.data) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
			}
		}
		
	}
	
	public static void main(String args[]) {
		RemoveDuplicateFromSortedLinkdedList obj = new RemoveDuplicateFromSortedLinkdedList();
		
		obj.head = new Node(10);
		Node second =  new Node(20);
		Node third = new Node(20);
		Node forth = new Node(40);
		Node fifth = new Node(50);
		
		obj.head.next = second;
		second.next = third;
		third.next =  forth;
		forth.next = fifth;
		
		obj.RemoveDuplicateSortedEle();
		obj.display();
		
		
	}
}
