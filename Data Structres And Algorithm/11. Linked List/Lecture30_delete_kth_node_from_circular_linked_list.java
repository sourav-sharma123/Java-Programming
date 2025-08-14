import java.util.Scanner;

public class Lecture30_delete_kth_node_from_circular_linked_list {
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
    static Node deleteKth(Node head, int k)    
    {
        if(head==null || head.next==head)
        {
            return null;
        }
        if(k==1)
        {
            head.data= head.next.data;
            head.next = head.next.next;
            return head;
        }
        else
        {
            Node curr= head;
            for(int i=0; i<k-2; i++)
            {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            return head;
        }
    }

    static void printlist(Node head)               //for loop
    { 
        if(head == null )
        {
            return;
        }
        System.out.println(head.data);
        for(Node curr = head.next; curr!=head; curr= curr.next)
        {
            System.out.println(curr.data);
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(100);
        head.next.next.next.next.next = head;
        printlist(head);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        head = deleteKth(head,k);
        System.out.println("New list is: ");
        printlist(head);
    }
}
