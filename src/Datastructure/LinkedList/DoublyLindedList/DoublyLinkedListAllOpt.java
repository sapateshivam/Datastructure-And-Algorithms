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

    public void display(Node node){
        Node curr = node;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr= curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedListAllOpt obj = new DoublyLinkedListAllOpt();
        obj.head = new Node(10);
        obj.tail = obj.head;
        obj.display(obj.head);        
        
    
    }
}
