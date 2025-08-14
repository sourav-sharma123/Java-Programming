                                            //Leader in an array
//Naive Algorithm
public class Lecture15_leader_in_an_array
{   static void leaders(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		boolean flag = false;
    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[i] <= arr[j])
    			{
    				flag = true;
    				break;
    			}
    		}
    		if(flag == false)
    		{
    			System.out.print(arr[i]+" ");
    		}
    	}
    }
    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;
       leaders(arr, n);
    } 
}


//Efficicent Solution
// public class Lecture15_leader_in_an_array
// {   static void leaders(int arr[], int n)
//     {
//     	int curr_ldr = arr[n - 1];
//     	System.out.print(curr_ldr+" ");
//     	for(int i = n - 2; i >= 0; i--)
//     	{
//     		if(curr_ldr < arr[i])
//     		{
//     			curr_ldr = arr[i];
//     			System.out.print(curr_ldr+" ");
//     		}
//     	}
//     }
//     public static void main(String args[]) 
//     { 
//        int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;
//        leaders(arr, n);
//     } 
// }


//Efficient solution think by You  (It is an int method code)
// public class Lecture15_leader_in_an_array {
//     static int [] leader(int ar[]){
//         int i=0;
//         int k=0;
//         int a[] = new int[ar.length];
//         int j=ar.length-1;
//         while(i!=ar.length-1){
//             if(i==j){
//                 a[k]= ar[j];
//                 k++;
//                 j=ar.length-1;
//                 i++;
//             }
//             if(ar[i]<=ar[j] && i<j){
//                 i++;
//                 j=ar.length-1;
//             }
//             else {
//                 j--;
//             }
//         }
//         a[k] = ar[ar.length-1];
//         return a;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{7,10,4,10,6,5,2};
//         System.out.println(" ");
//         int uniqueArray[] = leader(arr);
//         for(int i =0; i<uniqueArray.length; i++){
//             System.out.println(uniqueArray[i]);
//         }
//     }
// }

//Efficient solution think by You (It just a void method answer of above code)
// public class Lecture15_leader_in_an_array {
//     static void leader(int ar[]){
//         int i=0;
//         int j=ar.length-1;
//         while(i!=ar.length-1){
//             if(i==j){
//                 System.out.println(ar[j] + " ");
//                 j=ar.length-1;
//                 i++;
//             }
//             if(ar[i]<=ar[j] && i<j){
//                 i++;
//                 j=ar.length-1;
//             }
//                 j--;
//         }
//         System.out.println(ar[ar.length-1]);
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{7,10,4,10,6,5,2};
//         System.out.println(" ");
//         leader(arr);
//     }
// }
