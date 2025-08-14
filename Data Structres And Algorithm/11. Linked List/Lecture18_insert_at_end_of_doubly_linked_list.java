import org.w3c.dom.Node;

public class Lecture18_insert_at_end_of_doubly_linked_list {
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
    static Node insertEnd(Node head, int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            return temp;
        }
        Node curr = head;
        while(curr.next!= null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
    static void printlist(Node head)
    {
        Node curr= head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr= curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printlist(head);
        head = insertEnd(head, 50);
        printlist(head);
    }
}
