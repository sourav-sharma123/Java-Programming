//Naive Solution
// import java.util.Scanner;
// public class Lecture28_pefix_sum {
//     static int getSum(int arr[], int n, int l, int r)
//     {
//         int sum =0;
//         for(int i=l; i<=r; i++)
//         {
//             sum += arr[i];
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{2,8,3,9,6,5,4};
//         int n = arr.length;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of left index");
//         int l = sc.nextInt();
//         System.out.println("Enter the value of right index");
//         int r = sc.nextInt();
//         System.out.println("sum of range is: " + getSum(arr, n, l, r));
//     }
// }


//Efficient Method
// import java.util.Scanner;
// public class Lecture28_pefix_sum {
//     static int[] preSum(int arr[], int n)
//     {
//         int prefix_sum[] = new int[n];
//         prefix_sum[0] = arr[0];
//         for(int i=1; i<n; i++)
//         {
//             prefix_sum[i] = prefix_sum[i-1] + arr[i];
//         }
//         return prefix_sum;
//     }
//     static int getSum(int prefix_sum[], int l, int r)
//     {
//         if(l!=0)
//         {
//             return prefix_sum[r] - prefix_sum[l-1];
//         }
//         return prefix_sum[r];
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{2,8,3,9,6,5,4};
//         int n = arr.length;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of left index");
//         int l = sc.nextInt();
//         System.out.println("Enter the value of right index");
//         int r = sc.nextInt();
//         System.out.println("sum of range is: " + getSum(preSum(arr, n), l, r));
//     }
// }


//Given an array of integers, find if it has an equilibrium point.
//Naive Solution
// public class Lecture28_pefix_sum 
// { 
//     static boolean checkEquilibrium(int arr[], int n)
//     {
//     	for(int i  = 0; i < n; i++)
//     	{
//     		int l_sum = 0, r_sum = 0;
//     		for(int j = 0; j < i; j++)
//     			l_sum += arr[j];
//     		for(int k = i + 1; k < n; k++)
//     			r_sum += arr[k];
//     		if(l_sum == r_sum)
//     			return true;
//     	}
//     	return false;
//     }
//     public static void main(String args[]) 
//     { 
//        int arr[] = {3, 4, 8, -9, 20, 6}; 
//        int n = arr.length;
//        System.out.println(checkEquilibrium(arr, n));
//     } 
// }


//Efficient Method
// public class Lecture28_pefix_sum 
// { 
//     static boolean checkEquilibrium(int arr[], int n)
//     {
//     	int sum = 0;
//     	for(int i = 0; i < n; i++)
//     	{
//     		sum += arr[i];
//     	}
//     	int l_sum = 0;
//     	for(int i = 0; i < n; i++)
//     	{
//     		if(l_sum == sum - arr[i])
//     			return true;
//     		l_sum += arr[i];
//     		sum -= arr[i];
//     	}
//     	return false;
//     }
//     public static void main(String args[]) 
//     { 
//        int arr[] = {3, 4, 8, -9, 20, 6}; 
//        int n = arr.length;
//        System.out.println(checkEquilibrium(arr, n));
//     } 
// }


//Given n ranges, find the maximum appearing element in these ranges.
public class Lecture28_pefix_sum
{ 
    static int maxOcc(int L[], int R[], int n)
    {	                                        //L[i] is the starting point of the i-th range.
                                                //R[i] is the ending point of the i-th range.
	    	int arr[] = new int[1000];
	    	for(int i = 0; i < n; i++)
	    	{
	    		arr[L[i]]++;                    //From number 1 onward, at least one range is starting here.
             
                                                //Right after 3, which is 4 → so we subtract at 4.
	    		arr[R[i] + 1]--;                //Starting from 4, one of the ranges that was active has ended.
                                                //This makes sure that only numbers from 1 to 3 get counted.
	    	}
	    	int maxm = arr[0], res = 0;
	    	for(int i = 1; i < 1000; i++)
	    	{
	    		arr[i] += arr[i - 1];       
                                           //👉At the end arr[i] tells you: "How many ranges does number i belong to?"
	    		if(maxm < arr[i])
	    		{
	    			maxm = arr[i];
	    			res = i;
	    		}
	    	}
	    	return res;
    }
    public static void main(String args[]) 
    { 
       int L[] = {1, 2, 3}, R[] = {3, 5, 7}, n = 3;

      System.out.println( "Maximum occuring element is: "+maxOcc(L, R, n)); 
      
    } 

}
