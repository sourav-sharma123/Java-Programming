class Node
{
    int data; 
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}
public class Lecture9_insert_at_the_end_of_the_singly_linked_list {
    static Node insertEnd(Node head, int x)
    {
        Node curr = head;
        Node temp = new Node(x);
        if(head == null)
        {
            return temp;
        }
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    public static void main(String[] args) 
    {
        Node head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        head = insertEnd(head, 40);
        head = insertEnd(head, 50);
        head = insertEnd(head, 60);
        head = insertEnd(head, 70);
        printlist(head);  
    }
    public static void printlist(Node head)
    {
        if(head == null)
        {
            return;
        }
        System.out.println(head.data);
        printlist(head.next);
    }
}

// A
// A
// A
// A
// A
// A
// A
// A
// A
// A
// A