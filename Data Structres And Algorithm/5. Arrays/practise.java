// public class practise {
//     public static void main(String[] args) {
//         int i=0;
//         while(i<4){
//             System.out.println("Before" + i);
//             if(i==2){
//                 continue;
//             }
//             System.out.println("After" + i);
//             i++;
//         }
//     }
// }

//Major element in an array
// public class practise{
//     static int major(int ar[]){
//         int count =0;
//         int j=0;
//         int i=0;
//         while(i<=ar.length-1){
//             if(ar[j] == ar[i]){
//                 count ++;
//             }
//             if(i==ar.length-1){
//                 if(count>(ar.length/2)){
//                     return ar[j];
//                 }
//                 i=0;
//                 j++;
//                 count =0;
//             } 
//             if(j>=ar.length){
//                 break;
//             }
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         System.out.println(" ");
//         // int arr[] = new int[]{3,1,3,3,2};
//         int arr[] = new int[]{7};
//         System.out.println(major(arr));
//     }
// }


class practise{
    static int maxConsecutivesOnes(int arr[], int n)
    {
        int res=0;
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)
            {
                count =0;
            } 
            else
            {
                count ++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
    public static void main(String[] args) {
        // int arr[] = new int[]{0,1,1,0,1,0};
        int arr[] = new int[]{1,0,1,1,1,1,0,1,1};
        // int arr[] = new int[]{1,1,1,1};
        int n= arr.length;
        System.out.println("Hello");
        System.out.println("Count is: "+maxConsecutivesOnes(arr,n));
    }
}