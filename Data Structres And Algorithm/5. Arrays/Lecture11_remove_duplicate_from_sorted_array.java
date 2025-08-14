                                        //Remove Duplicate from an array
//Naive Solution
// public class Lecture11_remove_duplicate_from_sorted_array
// {   static int remDups(int arr[], int n)
//     {	int temp[] = new int[n];
//     	temp[0] = arr[0];
//     	int res = 1;
//     	for(int i = 1; i < n; i++)
//     	{   if(temp[res - 1] != arr[i])
//     		{
//     			temp[res] = arr[i];
//     			res++;
//     		}
//     	}
//     	for(int i = 0; i < res; i++)
//     	{
//     		arr[i] = temp[i];
//     	}
//     	return res;
//     }
//     public static void main(String args[]) 
//     {  int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
//        System.out.println("Before Removal");
//        for(int i = 0; i < n; i++)
//        {
//        		System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        n = remDups(arr, n);
//        System.out.println("After Removal");
//        for(int i = 0; i < n; i++)
//        {
//        		System.out.print(arr[i]+" ");
//        }
//     } 
// }


//Efficient Solution
public class Lecture11_remove_duplicate_from_sorted_array
{   static int remDups(int arr[], int n)
    {   int res = 1;
    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res - 1] != arr[i])
    		{
    			arr[res] = arr[i];
    			res++;
    		}
    	}
    	return res;
    }
    public static void main(String args[]) 
    {  int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
       System.out.println("Before Removal");
       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
       System.out.println();
       n = remDups(arr, n);
       System.out.println("After Removal");
       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    } 
}


//Think by You
// public class Lecture11_remove_duplicate_from_sorted_array {
//     static int[] removeDuplicate(int ar[]){
//         int count =0;
//         int i=0;
//         int n=0;
//         int a[] = new int[ar.length];
//         for(i=0; i<ar.length-2; i++){
//             if(ar[i]==ar[i+1]){
//                 count++;
//             }
//             else {
//                 n =n + (count -(count-1));
//                 a[n-1]= ar[i];
//             }
//         }
//         a[n]=ar[i];              //To copy the last item.
//         return a;
//     }
//     public static void main(String[] args) {
//         System.out.println(" ");
//         int arr[] = new int[]{10,20,20,30,30,30,30,40,40,50,50};
//         //int arr[] = new int[]{10,10,10};
//         int uniquearr[] = removeDuplicate(arr);
//         for(int i=0; i<uniquearr.length; i++)
//         {
//             System.out.println(uniquearr[i]);
//         }
//     }
// }
