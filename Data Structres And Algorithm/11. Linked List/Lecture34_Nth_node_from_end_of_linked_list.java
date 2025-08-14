import java.util.Scanner;

public class Lecture34_Nth_node_from_end_of_linked_list {
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
    static void print_Nth_from_end(Node head, int x)      //Naive Solution
    {
        if(head==null)
        {
            return;
        }
        int count =0;
        Node curr = head;
        while(curr!=null)
        { 
            count++;
            curr= curr.next;
        }
        curr = head;
        if(x>count)
        {
            return;
        }
        for(int i = 0; i<count-x; i++)
        {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    // static void print_Nth_from_end(Node head, int x)      //Efficient Solution
    // {
    //     if(head==null)
    //     {
    //         return;
    //     }
    //     Node first = head;
    //     for(int i=0; i<x; i++)
    //     {
    //         if(first==null)
    //         {
    //             return;
    //         }
    //         first = first.next;
    //     }
    //     Node second = head;
    //     while (first!=null) 
    //     {
    //         second = second.next;
    //         first = first.next;
    //     }
    //     System.out.println(second.data);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value which you want from end: ");
        int x = sc.nextInt();
        print_Nth_from_end(head, x);
    }
}
