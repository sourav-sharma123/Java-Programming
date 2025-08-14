public class Lecture26_circular_linked_list {
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
    // static void printlist(Node head)         //do while loop
    // {
    //     if(head == null )
    //     {
    //         return ;
    //     }
    //     Node curr = head;
    //     do
    //     {
    //         System.out.println(curr.data);
    //         curr = curr.next;
    //     }while(curr!= head);
    // }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head;
        printlist(head);
    }
}
