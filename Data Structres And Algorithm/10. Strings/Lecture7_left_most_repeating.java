//Naive Approach
import java.util.Scanner;
public class Lecture7_left_most_repeating {
    static int leftMost(String s1)
    {
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.nextLine();
        System.out.println("Hello");
        System.out.println("Index is: " + leftMost(s1));
    }
}


//Better Solution
// import java.util.Scanner;
// public class Lecture7_left_most_repeating {
//     static final int CHAR = 256;
//     static int leftMost(String s1)
//     {
//         int count[] = new int[CHAR];
//         for(int i=0; i<s1.length();i++)
//         {
//             count[s1.charAt(i)]++;
//         }
//         for(int i=0;i<s1.length();i++)
//         {
//             if(count[s1.charAt(i)]>1)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String s1 = sc.nextLine();
//         System.out.println("Hello");
//         System.out.println("Index is: " + leftMost(s1));
//     }
// }

//Efficient Approach 1
// import java.util.Arrays;
// import java.util.Scanner;
// public class Lecture7_left_most_repeating {
//     static final int CHAR = 256;
//     static int leftMost(String s1)
//     {
//         int fIndex[] = new int[CHAR];
//         Arrays.fill(fIndex, -1);
//         int res = Integer.MAX_VALUE;
//         for(int i=0; i<s1.length(); i++)
//         {
//             int f1 = fIndex[s1.charAt(i)];
//             if(f1==-1)
//             {
//                 fIndex[s1.charAt(i)]=i;
//             }
//             else
//             {
//                 res = Math.min(res, f1);
//             }
//         }
//         return (res==Integer.MAX_VALUE)?-1:res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String s1 = sc.nextLine();
//         System.out.println("Hello");
//         System.out.println("Index is: " + leftMost(s1));
//     }
// }


//Efficient Approach 2
// import java.util.Scanner;
// public class Lecture7_left_most_repeating {
//     static final int CHAR = 256;
//     static int leftMost(String s1)
//     {
//         boolean visited[] = new boolean[CHAR];
//         int res=-1;
//         for(int i=s1.length()-1;i>=0; i--)
//         {
//             if(visited[s1.charAt(i)])
//             {
//                 res =i;
//             }
//             else
//             {
//                 visited[s1.charAt(i)]=true;
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String s1 = sc.nextLine();
//         System.out.println("Hello");
//         System.out.println("Index is: " + leftMost(s1));
//     }
// }