package Datastructure.LinkedList.CircularLinkedList;

public class CircularLinkedList {
    private Node last;

    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert_first(int value){
        Node newNode = new Node(value);
        if(last==null){
            last = newNode;
            last.next = last;
        }else{
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void remove_first_node(){
        if(last==null){
            System.out.println("linkedlist is empty");
        }else if(last.next == last){
            last = null;
        }else{
            last.next = last.next.next;
        }
    }

    public void insert_last(int value){
        Node newNode = new Node(value);
        if(last==null){
            last = newNode; 
            last.next = last;
        }else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display(){
        if(last==null)
            return;
        Node first = last.next;
        while(first!=last){
            System.out.print(first.data + "->");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();
        obj.insert_first(10);
        obj.insert_first(20);
        obj.insert_last(30);
        obj.remove_first_node();
        obj.display();

    }

}
