public class Lecture33_middle_of_linked_list {
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
    static void middleEle(Node head)      //Naive Solution
    {
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            System.out.println(head.data);
        }
        Node curr = head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr = curr.next;
        }
        curr = head;
        for(int i=0; i<count/2; i++)
        {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    // static void middleEle(Node head)        //Efficient Solution
    // {
    //     if(head==null)
    //     {
    //         return ;
    //     }
    //     if(head.next==null)
    //     {
    //         System.out.println(head.data);
    //     }
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast!=null && fast.next!=null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     System.out.println(slow.data);
    // }
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
        middleEle(head);
    }
}
