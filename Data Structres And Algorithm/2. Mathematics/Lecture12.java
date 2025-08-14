                                                //Naive Solution

// import java.util.Scanner;

// public class Lecture12 {
//     static int power(int x, int n){
//         int res= 1;
//         for(int i=0; i<n; i++)
//         {
//             res = res*x;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println("Enter the power");
//         int b = sc.nextInt();
//         System.out.println(power(a, b));
//     }
// }



import java.util.Scanner;

public class Lecture12 {
    static int power(int x, int n){
        if (n==0){
            return 1;
        }
        int temp= power(x, n/2);
        temp = temp*temp;
        if(n%2==0){
            return temp;
        }
        else{
            return temp*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
}