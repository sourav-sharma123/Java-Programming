//Naive Solution
// public class Lecture20_trapping_rain_water {
//     static int get_water(int arr[], int n)
//     {
//         int res= 0;
//         for(int i=0; i<n-1;i++)
//         {
//             int lMax=arr[i];
//             for(int j=0; j<i;j++)               //ye i ki value or ith position se phele kai maximum value check karenga
//             {
//                 lMax= Math.max(lMax,arr[j]);
//             }
//             int rMax=arr[i];
//             for(int j=i+1; j<n; j++)           //ye i ki value or ith position kai baad ki maximum value check karenga 
//             {
//                 rMax = Math.max(rMax, arr[j]);
//             }
//             res= res+ Math.min(lMax, rMax) - arr[i];
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{3,0,1,2,5};
//         int n = arr.length;
//         System.out.println("Maximum water it can store is: " + get_water(arr,n));
//     }
// }


//Efficient Solution
// public class Lecture20_trapping_rain_water {
//     static int get_water(int arr[], int n)
//     {
//         int res=0;
//         int lMax[] = new int[n];
//         int rMax[] = new int[n];
//         lMax[0] = arr[0];
//         for(int i=1; i<n;i++)
//         {
//             lMax[i] = Math.max(arr[i],lMax[i-1]);
//         }
//         rMax[n-1] = arr[n-1];
//         for(int i=n-2; i>=0; i--)
//         {
//             rMax[i] = Math.max(arr[i], rMax[i+1]);
//         }
//         for(int i=0; i<n; i++)
//         {
//             res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
//         }
//         return res; 
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{3,0,1,2,5};
//         int n = arr.length;
//         System.out.println("Maximum water it can store is: " + get_water(arr,n));
//     }
// }