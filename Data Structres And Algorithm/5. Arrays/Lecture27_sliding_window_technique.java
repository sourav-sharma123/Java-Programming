//Given an array of integer anda number k, find the maximum sum of k consecutive elements.

//Naive Solution

// import java.util.Scanner;

// public class Lecture27_sliding_window_technique {
//     static int max_sum(int arr[] , int k, int n)
//     {
//         int max_sum=0;
//         for(int i=0 ; i+k-1<n; i++)
//         {
//             int sum =0;
//             for(int j=0; j<k; j++)
//             {
//                 sum += arr[i+j];
//             }
//             max_sum = Math.max(sum, max_sum);
//         }
//         return max_sum;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,8,30,-5,20,7};
//         int n = arr.length;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of k: ");
//         int k = sc.nextInt();
//         System.out.println("Maximum sum is: "+ max_sum(arr, k, n));
//     }
// }

//Efficient Solution
// import java.util.Scanner;

// public class Lecture27_sliding_window_technique {
//     static int max_sum(int arr[] , int k, int n)
//     {
//         int curr_sum = 0;
//         for(int i=0; i<k ; i++)
//         {
//             curr_sum += arr[i];
//         }
//         int max_sum = curr_sum;
//         for(int i=k; i<n ; i++)
//         {
//             curr_sum += (arr[i] - arr[i-k]);
//             max_sum = Math.max(curr_sum, max_sum);
//         }
//         return max_sum;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,8,30,-5,20,7};
//         int n = arr.length;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of k: ");
//         int k = sc.nextInt();
//         System.out.println("Maximum sum is: "+ max_sum(arr, k, n));
//     }
// }


//Given an sorted array of non-negative integers. Find if there is a subarray with given sum.

// //Naive Solution
// import java.util.Scanner;
// public class Lecture27_sliding_window_technique {
//     static boolean isSum(int arr[] , int n, int given_sum)
//     {
//         for(int i=0; i<n; i++)
//         {
//             int sum =0;
//             for(int j=i; j<n ; j++)
//             {
//                 sum +=arr[j];
//                 if(sum==given_sum)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,4,20,3,10,5};
//         int n = arr.length;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of sum: ");
//         int given_sum = sc.nextInt();
//         System.out.println("Sum is available: "+ isSum(arr, n, given_sum));
//     }
// }


//Efficient Solution
// import java.util.Scanner;
// public class Lecture27_sliding_window_technique {
//     static boolean isSum(int arr[] , int n, int given_sum)
//     {
//         int curr_sum = arr[0];
//         int start =0;
//         for(int end =1 ; end<n; end++)
//         {
//             //clean the previous window
//             while(curr_sum>given_sum && start< end-1)
//             {
//                 curr_sum -= arr[start];
//                 start++; 
//             }
//             if(curr_sum == given_sum)
//             {
//                 return true;
//             }
//             if(end< n)
//             {
//                 curr_sum += arr[end];
//             }
//         }
//         return (curr_sum==given_sum);
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,4,20,3,10,5};
//         int n = arr.length;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of sum: ");
//         int given_sum = sc.nextInt();
//         System.out.println("Sum is available: "+ isSum(arr, n, given_sum));
//     }
// }


//Print first M N-bonacci number 
// import java.util.Scanner;
// public class Lecture27_sliding_window_technique {
//     static void bonnaciSeries(int n, int m)
//     {
//         int arr[] = new int[m];
//         for(int i=0; i<m; i++)
//         {
//             arr[i]=0;
//         }
//         arr[n-1] = 1;
//         arr[n] = 1;
//         for(int i=n+1; i<m; i++)
//         {
//             arr[i] = 2 * arr[i-1] - arr[i-n-1];
//         }

//         for(int i=0; i<m; i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n-bonacci: ");
//         int n = sc.nextInt();
//         System.out.println("Enter the value of length you want: ");
//         int m = sc.nextInt();
//         bonnaciSeries(n, m);
//     }
// }

//Count distinct elements in every window of size k.
import java.util.HashMap;
import java.util.Scanner;
public class Lecture27_sliding_window_technique {
    static void countDistinct(int arr[],int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        System.out.print(map.size() + " ");

        for(int i=k; i<n; i++)
        {
            int elementToRemove = arr[i-k];
            map.put(elementToRemove, map.get(elementToRemove) -1);
            if(map.get(elementToRemove) ==0)
            {
                map.remove(elementToRemove);
            }

            map.put(arr[i], map.getOrDefault(arr[i],0) +1);

            System.out.print(map.size() + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,1,3,4,3,3};
        int n = arr.length;
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        countDistinct(arr,n, k);
    }
}