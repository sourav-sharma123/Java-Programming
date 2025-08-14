// import java.util.Scanner;

// public class Lecture4 {
//     static int fact(int x){
//         int res=1;
//         if (x==0 || x==1)
//         {
//             return 1;
//         }
//         for(int i=x; i>0; i--)
//         {
//             res = res *i ;
//         }
//         return res;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(fact(a));
//     }
// }


import java.util.Scanner;

public class Lecture4 {
    static int fact(int x){
        if (x ==0 || x==1)
        {
            return 1;
        }
        return x*fact(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
}
