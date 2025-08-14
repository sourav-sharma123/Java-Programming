//Naive Solution
// public class Lecture21_maximum_consecutive_ones 
// {
//     static int maxConsecutivesOnes(int arr[], int n)
//     {
//         int res=0;
//         for(int i=0; i<n; i++)
//         {
//             int count=0;
//             for(int j=i; j<n; j++)
//             {
//                 if(arr[j]==1)
//                 {
//                     count++;
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }
//             res = Math.max(res, count);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{0,1,1,0,1,0};
//         // int arr[] = new int[]{1,0,1,1,1,1,0,1,1};
//         // int arr[] = new int[]{1,1,1,1};
//         int n= arr.length;
//         System.out.println("Hello");
//         System.out.println("Count is: "+maxConsecutivesOnes(arr,n));
//     }
// }

//Efficient Solution
// public class Lecture21_maximum_consecutive_ones 
// {
//     static int maxConsecutivesOnes(int arr[], int n)
//     {
//         int res=0;
//         int count=0;
//         for(int i=0; i<n; i++)
//         {
//             if(arr[i]==0)
//             {
//                 count =0;
//             } 
//             else
//             {
//                 count ++;
//             }
//             res = Math.max(res, count);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         // int arr[] = new int[]{0,1,1,0,1,0};
//         // int arr[] = new int[]{1,0,1,1,1,1,0,1,1};
//         int arr[] = new int[]{1,1,1,1};
//         int n= arr.length;
//         System.out.println("Hello");
//         System.out.println("Count is: "+maxConsecutivesOnes(arr,n));
//     }
// }
