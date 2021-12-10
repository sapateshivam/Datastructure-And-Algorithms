package Datastructure.LinkedList.SinglyList;

public class SearchInLinkedList {
	private Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void search(int data) {
		Node curr = head;
		int flag = 0;
		while (curr != null) {
			if (curr.data == data) {
				flag = 1;
				break;
			}
			curr = curr.next;
		}
		if (flag==1)
			System.out.println("element is found");
		else
			System.out.println("element not found");
	}

	public static void main(String args[]) {
		SearchInLinkedList obj = new SearchInLinkedList();
		obj.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);

		obj.head.next = second;
		second.next = third;
		third.next = forth;

		obj.search(100);
	}
}
