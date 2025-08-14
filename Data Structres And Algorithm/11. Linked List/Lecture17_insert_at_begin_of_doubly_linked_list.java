public class Lecture17_insert_at_begin_of_doubly_linked_list {
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
    static Node insertBegin(Node head, int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            return temp;
        }
        head.prev = temp;
        temp.next = head;
        return temp;

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
    public static void main(String[] args) 
    {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printlist(head);
        head = insertBegin(head, 5);
        printlist(head);
    }
}
