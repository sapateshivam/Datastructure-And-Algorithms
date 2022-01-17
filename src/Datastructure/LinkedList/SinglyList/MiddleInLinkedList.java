package Datastructure.LinkedList.SinglyList;

public class MiddleInLinkedList {
	private Node head;
	
	public static class Node{
		int data;
		Node next;
	
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void middleInLinkdedList() {
		Node slowNode = head;
		Node fastNode = head;
		Node prev = null;
		
		while(fastNode!=null && fastNode.next!=null) {
			prev = slowNode;
			slowNode =  slowNode.next;
			fastNode = fastNode.next.next;
		}
		System.out.println("middle element is :" + slowNode.data);
		if(slowNode.next==null) {
			head = prev;
			slowNode = null;
		}else {			
			prev.next = slowNode.next;
		}
	}
	
	public void display() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[]) {
		MiddleInLinkedList obj  = new MiddleInLinkedList();
		
		obj.head = new Node(20);
		Node second =  new Node(10);
//		Node third = new Node(30);
//		Node forth = new Node(40);
//		Node fifth = new Node(50);
//		Node sixth = new Node(60);
		
		
		
		obj.head.next = second;
//		second.next = third;
//		third.next =  forth;
//		forth.next = fifth;
//		fifth.next = sixth;
//		
		obj.middleInLinkdedList();
		obj.display();
	}
	
}
