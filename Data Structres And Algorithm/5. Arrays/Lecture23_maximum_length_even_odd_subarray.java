// Naive Solution
// public class Lecture23_maximum_length_even_odd_subarray {
//     static int maxEvenOddSubarray(int arr[], int n)
//     {
//         int res=1;
//         for(int i=0; i<n; i++)
//         {
//             int curr=1;
//             for(int j=i+1; j<n; j++)
//             {
//                 if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0))
//                 {
//                     curr++;
//                 } 
//                 else
//                 {
//                     break;
//                 }
//             }
//             res = Math.max(res, curr);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,20,14,7,8};
//         int n = arr.length;
//         System.out.println("Length of subarray is: "+ maxEvenOddSubarray(arr,n));
//     }
// }


//Efficient Solution
public class Lecture23_maximum_length_even_odd_subarray {
    static int maxEvenOddSubarray(int arr[], int n)
    {
        int res=1;
        int curr=1;
        for(int i=1; i<n; i++)
        {
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0))
            {
                curr++;
                res = Math.max(res, curr);
            }
            else
            {
                curr=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,14,7,8};
        int n = arr.length;
        System.out.println("Length of subarray is: "+ maxEvenOddSubarray(arr,n));
    }
}