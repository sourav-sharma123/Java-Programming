public class Lecture29_delete_head_of_a_circular_linked_list {
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
    static Node delBegin(Node head)     //Naive Solution
    {
        if(head == null || head.next==head)
        {
            return null;
        }
        Node curr = head;
        while(curr.next!= head)
        {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }

    // static Node delBegin(Node head)     //Efficient Solution
    // {
    //     if(head == null || head.next==head)
    //     {
    //         return null;
    //     }
    //     head.data=head.next.data;
    //     head.next = head.next.next;
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
        head = delBegin(head);
        System.out.println("New list is: ");
        printlist(head);
    }
}
