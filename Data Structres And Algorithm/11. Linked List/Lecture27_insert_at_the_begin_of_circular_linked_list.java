public class Lecture27_insert_at_the_begin_of_circular_linked_list {
    static class Node
    {
        int data; 
        Node next;
        Node(int x)
        {
            data = x;
            next = null;
        }
    }
    static Node insertBegin(Node head, int x)     //Naive Solution
    {
        Node temp = new Node(x);
        if(head == null)
        {
            temp.next =temp;
        }
        Node curr = head;
        while(curr.next!=head) 
        {
            curr= curr.next;
        }
        curr.next = temp;
        temp.next= head;
        return temp;
    }

    // static Node insertBegin(Node head, int x)       //Efficient Solution
    // {
    //     Node temp = new Node(x);
    //     if(head == null)
    //     {
    //         temp.next =temp;
    //         return temp;
    //     }
    //     temp.next= head.next;
    //     head.next = temp;
    //     int a = head.data;
    //     head.data = temp.data;
    //     temp.data = a;
    //     return head;
    // }
    
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
        head.next = new Node(5);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head;
        printlist(head);
        head = insertBegin(head,1);
        System.out.println("New list is: ");
        printlist(head);
    }
}
