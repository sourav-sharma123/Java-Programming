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
public class Lecture8_insert_at_begin_of_singly_linked_list {
    static Node insertBegin(Node head, int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
    public static void main(String[] args) 
    {
        Node head = null;
        head = insertBegin(head, 70);
        head = insertBegin(head, 60);
        head = insertBegin(head, 50);
        head = insertBegin(head, 40);
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10); 
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
