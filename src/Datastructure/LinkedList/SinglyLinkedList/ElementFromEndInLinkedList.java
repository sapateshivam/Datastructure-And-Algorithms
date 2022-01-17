package Datastructure.LinkedList.SinglyLinkedList;


public class ElementFromEndInLinkedList {
	private Node head;
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void elementFromLastPostion(int pos) {
		Node ref = head;
		Node main = head;
		int count = 0;
		while(count<pos)
		{
			if(ref!=null) {				
				ref = ref.next;
				count++;
			}else {
				System.out.println("wrong position");
				main = null;
				break;
			}
		}
		while(ref!=null) {
			main = main.next;
			ref = ref.next;
		}
		if(main==null)
			System.out.println("Element not found");
		else
			System.out.println(main.data);
	}
	
	public static void main(String args[]) {
		ElementFromEndInLinkedList obj = new ElementFromEndInLinkedList();
		obj.head = new Node(10);
		Node second =  new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);
		Node fifth = new Node(50);
		
		
		obj.head.next = second;
		second.next = third;
		third.next =  forth;
		forth.next = fifth;
		
		obj.elementFromLastPostion(3);
	}
}
