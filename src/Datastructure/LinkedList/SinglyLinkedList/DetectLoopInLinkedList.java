package Datastructure.LinkedList.SinglyLinkedList;

public class DetectLoopInLinkedList {
    private Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
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
        System.out.println("null");
    }

    public int detectLoopInLinkedlist(){
        Node slowNode = head;
        Node FastNode = head;
        while(FastNode!=null && FastNode.next!=null){
            FastNode = FastNode.next.next;
            slowNode = slowNode.next;
            if(slowNode==FastNode)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        DetectLoopInLinkedList obj = new DetectLoopInLinkedList();
    
    // creating node objects
        obj.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
    
    // Let's connect object to each other
        obj.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = obj.head;

        int bool =  obj.detectLoopInLinkedlist();
        System.out.println(bool);


    }
}
