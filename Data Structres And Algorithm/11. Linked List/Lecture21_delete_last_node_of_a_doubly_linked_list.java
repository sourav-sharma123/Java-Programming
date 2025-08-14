public class Lecture21_delete_last_node_of_a_doubly_linked_list {
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
    static Node delLast(Node head)        //Sir logic
    {
        if(head == null || head.next==null)
        {
            return null;
        }
        Node curr = head;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
    // static Node delLast(Node head)        //Your logic
    // {
    //     if(head == null || head.next==null)
    //     {
    //         return null;
    //     }
    //     Node curr = head;
    //     while(curr.next.next!=null)
    //     {
    //         curr = curr.next;
    //     }
    //     curr.next = null;
    //     return head;
    // }
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
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
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
        printlist(head);
        head = delLast(head);
        System.out.println("New list is: ");
        printlist(head);
    }
}