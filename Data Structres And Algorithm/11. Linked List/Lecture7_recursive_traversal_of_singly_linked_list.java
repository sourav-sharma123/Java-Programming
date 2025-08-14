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
public class Lecture7_recursive_traversal_of_singly_linked_list {
    static void printlist(Node head)
    {
        if(head == null)
        {
            return;
        }
        System.out.println(head.data);
        printlist(head.next);
    }
    public static void main(String[] args) 
    {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        printlist(head);
    }
}
