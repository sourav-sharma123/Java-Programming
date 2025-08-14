                                //Guess the output of the following code.
import java.util.Scanner;
public class Lecture3 {
    static void fun(int n){
        if(n==0){
            return;              //Agr command ispe ata hai to koi bhi next line of command execute nhi hoga..
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        fun(a);
    }
}


//Guess the output of the following code.

// import java.util.Scanner;
// public class Lecture3 {
//     static void fun(int n){
//         if(n==0){
//             return;              //Agr command ispe ata hai to koi bhi next line of command execute nhi hoga..
//         }
//         fun(n-1);
//         System.out.println(n);
//         fun(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         fun(a);
//     }
// }