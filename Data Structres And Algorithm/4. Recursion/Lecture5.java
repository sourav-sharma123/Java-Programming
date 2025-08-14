                                            //Print N to 1 using recursion
import java.util.Scanner;
public class Lecture5 {
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        fun(a);
    }
}
