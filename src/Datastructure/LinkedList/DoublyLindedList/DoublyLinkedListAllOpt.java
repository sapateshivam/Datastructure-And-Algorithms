package Datastructure.LinkedList.DoublyLindedList;

public class DoublyLinkedListAllOpt {
    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void displayhead(Node node){
        Node curr = node;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr= curr.next;
        }
        System.out.println("null");
    }

    public void displayprev(Node node){
        Node curr = node;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr= curr.prev;
        }
        System.out.println("null");
    }

    public void insert_first(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
           newNode.prev = null;
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListAllOpt obj = new DoublyLinkedListAllOpt();
        obj.insert_first(10);
        obj.insert_first(20);
        obj.insert_first(30);
        obj.insert_first(40);
        obj.displayprev(obj.tail);
        obj.displayhead(obj.head);
    }
}
