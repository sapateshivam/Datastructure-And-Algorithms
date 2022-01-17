package Datastructure.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class RemoveKeyFromLinkedList {
    private Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"-> ");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public void removeKeyFromLinkedList(int n){
        Node curr = head;
        Node temp = null;
        while(curr!=null && curr.data!=n){
            temp = curr;
            curr = curr.next;
        }
        if(curr.next!=null){
            temp.next = curr.next;
        }else
            temp.next = null;
    }

    public static void main(String[] args) {
        RemoveKeyFromLinkedList obj = new RemoveKeyFromLinkedList();
        
        //creating all nodes
        obj.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

        //linking all nodes to each other
        obj.head.next = second;
        second.next= third;
        third.next = forth;

        obj.display();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        obj.removeKeyFromLinkedList(n);
        obj.display();

    }
}
