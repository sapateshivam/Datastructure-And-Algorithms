package Datastructure.LinkedList.SinglyLinkedList;

public class RemoveLoopInLinkedList {

	private Node head;
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			
		}
	}
	
	public void display() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.println("null");
	}
	
	public void removeLoopInLinkedlist() {
		Node fastNode = head;
		Node slowNode = head;
		while(fastNode!=null && fastNode.next!=null) {
			fastNode= fastNode.next.next;
			slowNode= slowNode.next;
			if(fastNode==slowNode) {
				System.out.println("loop detected");
				removeLoop(slowNode);
			}
		}
	}
	
	public void removeLoop(Node slowNode) {
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			if(slowNode.next==temp)
				slowNode.next = null;
		}
		System.out.println("removed loop from linkedlist");
		
	}
	
	public static void main(String args[]) {
		RemoveLoopInLinkedList obj = new RemoveLoopInLinkedList();
		obj.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth  = new Node(40);
		Node fifth = new Node(50);
		Node sixth = new Node(60);
		
		obj.head.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
		
		obj.removeLoopInLinkedlist();
		obj.display();
		
	}
}
