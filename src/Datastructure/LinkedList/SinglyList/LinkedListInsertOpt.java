package Datastructure.LinkedList.SinglyList;


public class LinkedListInsertOpt {
	private Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertFirst(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}

	public void insertLast(int data) {
		Node temp = new Node(data);

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
	}

	public void insertPosition(int data, int pos) {
		Node newNode = new Node(data);

		Node prev = null;
		Node curr = head;
		for (int i = 1; i < pos; i++) {
			if (curr.next == null) {
				System.out.println("Position Not Found");
				break;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		prev.next = newNode;
		newNode.next = curr;
	}

	public static void main(String args[]) {
		LinkedListInsertOpt obj = new LinkedListInsertOpt();

		obj.head = new Node(10);
		obj.insertFirst(20);
		obj.insertFirst(30);
		obj.display();
		obj.insertFirst(40);
		obj.insertFirst(50);
		obj.insertLast(100);
		obj.display();
		obj.insertPosition(10, 2);
		obj.display();

	}
}
