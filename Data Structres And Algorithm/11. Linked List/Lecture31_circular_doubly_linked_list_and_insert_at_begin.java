public class Lecture31_circular_doubly_linked_list_and_insert_at_begin {
    static class Node
    {
        int data; 
        Node prev;
        Node next;
        Node(int x)
        {
            data = x;
            prev = null;
            next = null;
        }
    }
    static Node insertBegin(Node head, int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            temp.next = temp;
            temp.prev = temp; 
            return temp;
        }
        head.prev.next=temp;
        temp.prev= head.prev;
        temp.next= head;
        head.prev= temp;
        return temp;
    }
    static void printlist(Node head)               //for loop
    { 
        if(head == null )
        {
            return;
        }
        System.out.println(head.data);
        for(Node curr = head.next; curr!=head; curr= curr.next)
        {
            System.out.println(curr.data);
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
        head.prev = temp5;
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp2.next = temp3;
        temp3.prev = temp2;
        temp3.next = temp4;
        temp4.prev = temp3;
        temp4.next = temp5;
        temp5.prev = temp4;
        temp5.next = head;
        printlist(head);
        head= insertBegin(head, 100);
        System.out.println("New list is: ");
        printlist(head);
    }
}
