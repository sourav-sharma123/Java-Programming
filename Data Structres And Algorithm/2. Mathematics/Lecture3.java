import java.util.Scanner;

public class Lecture3 {
    static boolean isPal(long x)
    {
        long temp = x;
        long rev = 0;
        while(temp!=0)
        {
            rev = rev*10 + temp%10 ;
            temp=temp/10;
        } 
        // System.out.println(rev + " " + x);
        return (rev==x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long a = sc.nextLong();
        System.out.println(isPal(a));
    }
}
