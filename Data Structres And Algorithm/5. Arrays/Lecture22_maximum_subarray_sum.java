// Naive Solution
// public class Lecture22_maximum_subarray_sum {
//     static int maxSubarray(int arr[], int n)
//     {
//         int res =arr[0];
//         for(int i=0; i<n; i++)
//         {
//             int curr=0;
//             for(int j=i; j<n; j++)
//             {
//                 curr= curr+ arr[j];
//                 res = Math.max(res, curr);
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{-5,1,-2,3,-1,2,-2};
//         int n= arr.length;
//         System.out.println("Hello");
//         System.out.println("Maximum is : "+maxSubarray(arr,n));
//     }
// }


//Efficient Solution
public class Lecture22_maximum_subarray_sum {
    static int maxSubarray(int arr[], int n)
    {
        int res=arr[0];
        int maxEnding= arr[0];
        for(int i=1; i<n; i++)
        {
            maxEnding= Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{-5,1,-2,3,-1,2,-2};
        int n= arr.length;
        System.out.println("Hello");
        System.out.println("Maximum is : "+maxSubarray(arr,n));
    }
}
