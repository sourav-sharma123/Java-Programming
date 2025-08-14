public class Lecture35_reverse_a_linked_list_iteratively {
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
    // static Node reverseList(Node head)    
    // {
    //     if(head==null)
    //     {
    //         return null;
    //     }
    //     Node temp=head.next;
    //     head.next = null;
    //     Node curr= head;
    //     Node temp1 = head;
    //     while(temp!=null)
    //     {
    //         temp1 = temp.next;
    //         temp.next = curr;
    //         curr = temp;
    //         temp = temp1;
    //     }
    //     return curr;
    // }
    static Node reverseList(Node head)
    {
        Node curr = head;
        Node prev = null;
        while(curr!=null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static void printlist(Node head)
    {
        if(head == null)
        {
            return;
        }
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
        Node temp6 = new Node(70);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        printlist(head);
        head = reverseList(head);
        printlist(head);
    }
}
