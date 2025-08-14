                                    //Maximum Difference between elements of an array
//Naive Solution
// public class Lecture16_maximum_difference_between_an_element 
// {   static int maxDiff(int arr[], int n)
//     {   int res = arr[1] - arr[0];
//     	for(int i = 0; i < n - 1; i++){
//     		for(int j = i + 1; j < n; j++){
//     			res = Math.max(res, arr[j] - arr[i]);
//     		}
//     	}
//     	return res;
//     }
//     public static void main(String args[]) 
//     { 
//        int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;
//        System.out.println(maxDiff(arr, n));
//     } 
// }

//Efficient Solution
public class Lecture16_maximum_difference_between_an_element
{   static int maxDiff(int arr[], int n)
    {   int res = arr[1] - arr[0], minVal = arr[0];
    	for(int i = 1; i < n; i++)
    	{
    			res = Math.max(res, arr[i] - minVal);		
    			minVal = Math.min(minVal, arr[i]);
    	}
    	return res;
    }
    public static void main(String args[]) 
    { 
       int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;
       System.out.println(maxDiff(arr,n));
    } 
}


//Efficient Solution think by You
// public class Lecture16_maximum_difference_between_an_element {
//     static int maximumDifference(int ar[]){
//         int i=0;
//         int j=ar.length-1;
//         int res= ar[j] - ar[i];
//         int diff;
//         while(i!= ar.length-2){ 
//             if(i==j ){
//                 i++;
//                 j=ar.length-1;
//             }
//             diff = ar[j] - ar[i]; 
//             if(res<diff){
//                 res = diff;
//             }
//             j--;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{2,3,10,6,4,8,1};
//         // int arr[] = new int[]{7,9,5,6,3,2};
//         // int arr[] = new int[]{10,20,30};
//         // int arr[] = new int[]{30,10,8,2};
//         System.out.println(" ");
//         System.out.println("The maximum difference is: " + maximumDifference(arr));
//     }
// }
