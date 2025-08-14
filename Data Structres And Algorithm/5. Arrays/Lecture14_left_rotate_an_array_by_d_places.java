                                                    //Left rotate an array by d places
//Naive Solution 
public class Lecture14_left_rotate_an_array_by_d_places 
{   static void lRotateOne(int arr[], int n)
    {   int temp = arr[0];
    	for(int i = 1; i < n; i++){
    		arr[i - 1] = arr[i];
    	}
    	arr[n - 1] = temp;
    }
    static void leftRotate(int arr[], int d, int n)
    {   for(int i = 0; i < d; i++){
    		lRotateOne(arr, n);
    	}
    }
    public static void main(String args[]) 
    {  int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;
       System.out.println("Before Rotation");
       for(int i = 0; i < n; i++){
       		System.out.print(arr[i]+" ");
       }
       System.out.println();
       leftRotate(arr, d, n);
       System.out.println("After Rotation");
       for(int i = 0; i < n; i++){
       		System.out.print(arr[i]+" ");
       }
    } 
}

//Efficient Solution
// public class Lecture14_left_rotate_an_array_by_d_places 
// {   static void leftRotate(int arr[], int d, int n)
//     { 	int temp[] = new int[d];
//     	for(int i = 0; i  < d; i++){
//     		temp[i] = arr[i];
//     	}
//     	for(int i = d; i  < n; i++){
//     		arr[i - d] = arr[i];
//     	}
//     	for(int i = 0; i  < d; i++){
//     		arr[n - d + i] = temp[i];
//     	}	
//     }
//     public static void main(String args[]) 
//     {  int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;
//        System.out.println("Before Rotation");
//        for(int i = 0; i < n; i++){
//        		System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        leftRotate(arr, d, n);
//        System.out.println("After Rotation");
//        for(int i = 0; i < n; i++){
//        		System.out.print(arr[i]+" ");
//        }
//     } 
// }


//Recursive Solution          //Very unique and easy solution go through this.
// public class Lecture14_left_rotate_an_array_by_d_places 
// {   static void leftRotate(int arr[], int d, int n)
//     {
//     	reverse(arr, 0, d - 1);
//     	reverse(arr, d, n - 1);
//     	reverse(arr, 0, n - 1);

//     }
//     static void reverse(int arr[], int low, int high)
//     {
//     	while(low < high)
//     	{
//     		int temp = arr[low];
//     		arr[low] = arr[high];
//     		arr[high] = temp;
//     		low++;
//     		high--;
//     	}
//     }
//     public static void main(String args[]) 
//     {  int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;
//        System.out.println("Before Rotation");
//        for(int i = 0; i < n; i++){
//        		System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        leftRotate(arr, d, n);
//        System.out.println("After Rotation");
//        for(int i = 0; i < n; i++){
//        		System.out.print(arr[i]+" ");
//        }
//     } 
// }

//Efficient Solution Think by You 
// import java.util.Scanner;
// public class Lecture14_left_rotate_an_array_by_d_places {
//     static int [] leftRotate(int ar[],int d){
//         int n=0;
//         int cap = ar.length;
//         int newAr[] = new int[ar.length];
//         for(int i=0; i<ar.length; i++){
//             n = i-d;
//             if(n<0){
//                 newAr[cap+n] = ar[i];
//             }
//             else{
//                 newAr[n] = ar[i];
//             }
//         }
//         return newAr;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number by how many position you want to displace: " );
//         int d = sc.nextInt();
//         int arr[] = new int[]{1,2,3,4,5,6,7};
//         System.out.println("Here is your new array");
//         int uniqueArray [] = leftRotate(arr,d);
//         for(int i=0; i<uniqueArray.length; i++){
//             System.out.println(uniqueArray[i]);
//         }
//     }
// }
