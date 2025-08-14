import java.util.Scanner;

public class Lecture6 {
    static int Gcd(int x, int y){
        int temp = Math.min(x, y);
        while(temp>0)
        {
            if(x%temp == 0 && y%temp ==0)
            {
                break;
            }
            temp--;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println(Gcd(a, b));
    }
}

                                            //Euclidean Algorithm

// import java.util.Scanner;

// public class Lecture6 {
//     static int Gcd(int x, int y){
//         while(x!=y)
//         {
//             if(x>y){
//                 x=x-y;
//             }
//             else{
//                 y=y-x;
//             }
//         }
//         return x;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         System.out.println(Gcd(a, b));
//     }
// }


//Optimized Version of Euclidean Algorithm

// import java.util.Scanner;

// public class Lecture6 {
//     static int Gcd(int x, int y){
//         if(y==0)
//         {
//             return x;
//         }
//         else{
//             return Gcd(y, x%y);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         System.out.println(Gcd(a, b));
//     }
// }

