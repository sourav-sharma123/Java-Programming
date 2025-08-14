import java.util.Scanner;

public class Lecture32_sorted_insert_at_singly_linked_list {
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
    static Node sortedInsert(Node head, int x)      //Sir logic
    {
        Node temp = new Node(x);
        if(head == null)
        {
            return temp;
        }
        if(x<head.data)
        {
            temp.next=head;
            return temp;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data<x)
        {
            curr = curr.next;
        }
        temp.next= curr.next;
        curr.next = temp;
        return head;
    }
    // static Node sortedInsert(Node head, int x)     //Your logic
    // {
    //     Node temp = new Node(x);
    //     if(head == null)
    //     {
    //         return temp;
    //     }
    //     if(x<head.data)
    //     {
    //         temp.next=head;
    //         return temp;
    //     }
    //     Node curr = head;
    //     while(curr.next!=null)
    //     {
    //         if(x<curr.next.data)
    //         {
    //             temp.next= curr.next;
    //             curr.next = temp;
    //             return head;
    //         }
    //         curr = curr.next;
    //     }
    //     curr.next=temp;
    //     return head;
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
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        printlist(head);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to insert");
        int x = sc.nextInt();
        head = sortedInsert(head, x);
        printlist(head);
    }
}
