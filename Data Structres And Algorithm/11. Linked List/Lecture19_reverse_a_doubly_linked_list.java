public class Lecture19_reverse_a_doubly_linked_list {
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
    static Node reverseList(Node head)        //Your logic is same like sir you can it, the diiference is sir
                                              //use prev variable and you use temp variable
    {
        if(head == null || head.next==null)
        {
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(curr!= null)
        {
            prev = curr.prev;
            curr.prev= curr.next;
            curr.next= prev;
            curr = curr.prev;
        }
        return prev.prev;
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
        head = reverseList(head);
        System.out.println("Reverse is: ");
        printlist(head);
    }
}
//Written by you
// static Node reverseList(Node head)
    // {
    //     if(head == null || head.next==null)
    //     {
    //         return head;
    //     }
    //     Node temp = null;
    //     Node curr = head;
    //     while(curr.next!= null)
    //     {
    //         temp = curr.prev;
    //         curr.prev= curr.next;
    //         curr.next= temp;
    //         curr = curr.prev;
    //     }
    //     curr.next = curr.prev;
    //     curr.prev = null;
    //     return curr;
    // }
//Written by you
// static Node reverseList(Node head)
// {
//     if(head == null || head.next==null)
//     {
//         return head;
//     }
//     Node temp = null;
//     Node curr = head;
//     while(curr!= null)
//     {
//         temp = curr.prev;
//         curr.prev= curr.next;
//         curr.next= temp;
//         curr = curr.prev;
//     }
//     return temp.prev;
// }