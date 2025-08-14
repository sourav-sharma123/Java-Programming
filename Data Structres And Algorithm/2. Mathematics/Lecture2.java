import java.util.Scanner;

public class Lecture2 {
    static int countDigit(long x)
    {
        int res=0;
        while(x!=0)
        {
            x=x/10;
            ++res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long a = sc.nextLong();
        System.out.println(countDigit(a));
    }
}
