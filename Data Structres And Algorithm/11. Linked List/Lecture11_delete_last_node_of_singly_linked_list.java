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
public class Lecture11_delete_last_node_of_singly_linked_list {
    static Node delTail(Node head)
    {
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return null;
        }
        Node curr = head;
        while(curr.next.next!= null)
        {
            curr= curr.next;
        }
        curr.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head = delTail(head);
        printlist(head);
    }
    static void printlist(Node head)
    {
        Node curr  = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
