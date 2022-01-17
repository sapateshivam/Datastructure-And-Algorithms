package Datastructure.LinkedList.SinglyLinkedList;

public class LinkedListDeleteOpt {

	private Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void deleteFirst() {
		Node curr = head;
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			head = curr.next;
		}
	}

	public void deleteLast() {
		Node prv = null;
		Node curr = head;
		if (curr.next == null)
			head = null;
		else {
			while (curr.next != null) {

				prv = curr;
				curr = curr.next;
			}
			prv.next = null;
		}

	}

	public void deletePosition(int pos) {
		Node curr = head;
		Node prv = null;
		for (int i = 1; i < pos; i++) {
			if (curr == null) {
				System.out.println("wrong position");
				break;
			} else {
				prv = curr;
				curr = curr.next;
			}
		}
		if (curr != null)
			prv.next = curr.next;
	}

	public void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.print("null");
	}

	public static void main(String args[]) {
		LinkedListDeleteOpt obj = new LinkedListDeleteOpt();
		obj.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);

		obj.head.next = second;
		second.next = third;
		third.next = forth;

		obj.deletePosition(3);
		obj.deleteFirst();
		obj.deleteLast();
		obj.display();

	}

}
