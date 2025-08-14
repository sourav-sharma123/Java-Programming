                                            //Guess the output of the following code.
// import java.util.Scanner;
// public class Lecture4 {
//     static int fun(int n){
//         if(n==1){
//             return 0;
//         }
//         else{
//             return 1+ fun(n/2);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(fun(a));
//     }
// }
// It gives you the floor of log2(n).





// import java.util.Scanner;
// public class Lecture4 {
//     static int fun(int n){
//         if(n<3){
//             return 0;
//         }
//         else{
//             return 1+ fun(n/3);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(fun(a));
//     }
// }
//It gives you the floor of log3(n).



import java.util.Scanner;
public class Lecture4 {
    static void fun(int n){
        if(n==0){
            return ;
        }
        fun(n/2);
        System.out.println(n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        fun(a);
    }
}
//It prints the binary representation of the number.