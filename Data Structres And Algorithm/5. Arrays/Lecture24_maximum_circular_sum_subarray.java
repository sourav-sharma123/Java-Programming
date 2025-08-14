//Naive Solution
// public class Lecture24_maximum_circular_sum_subarray {
//     static int maxCircularSubarray(int arr[], int n)
//     {
//         int res =arr[0];
//         for(int i=0; i<n; i++)
//         { 
//             int curr_max = arr[i];
//             int curr_sum = arr[i];
//             for(int j=1; j<n; j++)
//             {
//                 int index = (i+j)%n;    //circularly array ko traverse krne ke liye
//                 curr_sum += arr[index];
//                 curr_max = Math.max(curr_max, curr_sum); 
//             }
//             res = Math.max(res, curr_max);
//         }
//         return res;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[] = new int[]{5,-2,3,4};
//         int n= arr.length;
//         System.out.println("Hello");
//         System.out.println("Maximum is : "+maxCircularSubarray(arr,n));
//     }
// }


//Efficient Solution
public class Lecture24_maximum_circular_sum_subarray {
    static int maxNormalSubarray(int arr[], int n)
    {
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i=1; i<n; i++)
        {
            maxEnding  = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    static int maxCircularSubarray(int arr[], int n)
    {
        int max_Normal = maxNormalSubarray(arr,n);
        if(max_Normal < 0)                     //If all the element in the array is negative
        {
            return max_Normal;
        }
        int arr_sum =0;
        for(int i=0; i<n; i++)
        {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_Circular = arr_sum + maxNormalSubarray(arr,n);
        return Math.max(max_Normal, max_Circular); 
    }
    public static void main(String[] args) 
    {
        int arr[] = new int[]{5,-2,3,4};
        int n= arr.length;
        System.out.println("Hello");
        System.out.println("Maximum is : "+maxCircularSubarray(arr,n));
    }
}

//Efficient Solution think by you with the help of Sir's logic
// public class Lecture24_maximum_circular_sum_subarray {
//     static int maxNormalSubarray(int arr[], int n)
//     {
//         int res = arr[0];
//         int maxEnding = arr[0];
//         for(int i=1; i<n; i++)
//         {
//             maxEnding  = Math.max(arr[i], maxEnding + arr[i]);
//             res = Math.max(res, maxEnding);
//         }
//         return res;
//     }
//     static int maxCircularSubarray(int arr[], int n)
//     {
//         int max_Normal = maxNormalSubarray(arr,n);
//         if(max_Normal < 0)                     //If all the element in the array is negative
//         {
//             return max_Normal;
//         }
//         int arr_sum =0;
//         int resc = arr[0];
//     	int maxEndingc = arr[0];
//         for(int i = 1; i < n; i++)
//     	{
//     		maxEndingc = Math.min(maxEndingc + arr[i], arr[i]);
//     		resc = Math.min(maxEndingc, resc);
//     	}
//     	for(int i = 0; i < n; i++)
//     	{
//     		arr_sum += arr[i];
//     	}
//         int max_Circular = arr_sum - resc;
//         return Math.max(max_Normal, max_Circular); 
//     }
//     public static void main(String[] args) 
//     {
//         int arr[] = new int[]{5,-2,3,4};
//         int n= arr.length;
//         System.out.println("Hello");
//         System.out.println("Maximum is : "+maxCircularSubarray(arr,n));
//     }
// }

//Mere waley logic mai maine whole array ka sum nikala and subtract kr diya middle wale elements se
//and it returns the max_Circular.