package Datastructure.LinkedList.SinglyLinkedList;

public class AdditionOfTwoLinkedList {
    private Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static Node addTwoLinkedlist(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int x = a != null ? a.data : 0;
            int y = b != null ? b.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
            if (a != null)
                a = a.next;
            if (b != null)
                b = b.next;
        }
        if (carry > 0) {
            tail.next = new Node(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AdditionOfTwoLinkedList list1 = new AdditionOfTwoLinkedList();
        list1.head = new Node(7);
        Node secondlist1 = new Node(4);
        Node thirdlist1 = new Node(9);

        list1.head.next = secondlist1;
        secondlist1.next = thirdlist1;

        AdditionOfTwoLinkedList list2 = new AdditionOfTwoLinkedList();
        list2.head = new Node(5);
        Node secondlist2 = new Node(6);

        list2.head.next = secondlist2;

        AdditionOfTwoLinkedList resultList = new AdditionOfTwoLinkedList();
        resultList.head = addTwoLinkedlist(list1.head, list2.head);
        resultList.display(resultList.head);        
    }
}
