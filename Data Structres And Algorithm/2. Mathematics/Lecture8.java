// import java.util.Scanner;
// public class Lecture8 {
//     static boolean prime(int x){
//         int count=0;
//         if (x==1) {
//             return false;
//         }
//         for(int i=2; i<x; i++)
//         {
//             if(x%i==0){
//                 return (false);
//             }
//         }
//         return true; 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(prime(a));
//     }
// }


// import java.util.Scanner;
// public class Lecture8 {
//     static boolean prime(int x){
//         int count=0;
//         if (x==1) {
//             return false;
//         }
//         for(int i=2; i*i<x; i++)
//         {
//             if(x%i==0){
//                 return (false);
//             }
//         }
//         return true; 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(prime(a));
//     }
// }



import java.util.Scanner;

public class Lecture8 {
    static boolean prime(int x){
        if(x==1) return false;
        if(x==2 || x==3) return true;
        if(x%2==0 || x%3==0) return false;
        for(int i=5; i*i<=x; i++)
        {
            if(x%i == 0 || x%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(prime(a));
    }
}


