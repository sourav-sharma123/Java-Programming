//Writing base cases
                                        //For factorial of a number
import java.util.Scanner;
public class Lecture8 {
    static int fun(int n){
        if(n==0){
            return 1;
        }
        return n*fun(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(fun(a));
    }
}

                                        //For fibonacci series
// import java.util.Scanner;
// public class Lecture8 {
//     static int fib(int n){
//         if(n<=1){
//             return n;
//         }
//         return fib(n-1) + fib(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the position upto which you want the sum");
//         int a = sc.nextInt();
//         System.out.println(fib(a));
//     }
// }