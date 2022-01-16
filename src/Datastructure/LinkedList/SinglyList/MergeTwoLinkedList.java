package Datastructure.LinkedList.SinglyList;

public class MergeTwoLinkedList {
    private  Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Node mergeTwoLindedList(Node head1, Node head2){
        Node dummy = new Node(0);
        Node tail = dummy;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if(head1==null){
            tail.next=head2;
        }else{
            tail.next=head1;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoLinkedList l1 = new MergeTwoLinkedList();
        l1.head = new Node(1);
        Node secondl1 = new Node(4);
        Node thirdl1 = new Node(8);

        l1.head.next = secondl1;
        secondl1.next = thirdl1;
        l1.display(l1.head);

        MergeTwoLinkedList l2  = new MergeTwoLinkedList();
        l2.head = new Node(3);
        Node secondl2 = new Node(6);
        Node thirdl2 = new Node(7);

        l2.head.next = secondl2;
        secondl2.next = thirdl2;
        l2.display(l2.head);

        MergeTwoLinkedList resultobj = new MergeTwoLinkedList();
        resultobj.head = resultobj.mergeTwoLindedList(l1.head, l2.head);
        resultobj.display(resultobj.head);

    }

}
