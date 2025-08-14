                                                //Sum of Natural Number using Recursion
import java.util.Scanner;
public class Lecture9 {
    static int sum(int n){
        if(n<=1){
            return n;
        }
        return n+ sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(sum(a));
    }
}
