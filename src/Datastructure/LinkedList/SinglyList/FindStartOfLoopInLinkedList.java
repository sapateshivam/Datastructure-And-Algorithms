package Datastructure.LinkedList.SinglyList;

public class FindStartOfLoopInLinkedList {
	private Node head;
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void findStartingOfLoop() {
		Node fastNode = head;
		Node slowNode = head;
		while(fastNode!=null && fastNode.next!=null) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
			if(slowNode==fastNode) {
				Node start = getStartingNode(slowNode);
				System.err.println(start.data);
				break;
			}
		}
	}
	
	public Node getStartingNode(Node slowNode) {
		Node temp = head;
		while(slowNode!=temp) {
			temp = temp.next;
			slowNode = slowNode.next;
		}
		return temp;
	}
	
	public static void main(String args[]) {
		FindStartOfLoopInLinkedList obj = new FindStartOfLoopInLinkedList();
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
		
		obj.findStartingOfLoop();
		
	}
	
}
