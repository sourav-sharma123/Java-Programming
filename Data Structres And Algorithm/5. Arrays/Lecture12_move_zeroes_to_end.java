                                        //Move zeroes to the end of an array

//Naive Solution
public class Lecture12_move_zeroes_to_end 
{
    static void  moveToEnd(int ar[])
    {
        int temp=0;
        for(int i=0;i<ar.length; i++)
        {
            if(ar[i] ==0){
                for(int j=i+1; j<ar.length; j++)
                {
                    if(ar[j]!=0)
                    {
                        temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]= temp;
                    }
                }
            }
        }
        for(int i=0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(" ");
        // int arr[] = new int[]{8,5,0,10,0,20};
         int arr[] = new int[]{10,5,0,0,8,0,9,0};
        // int arr[] = new int[]{0,0,0,10,0};
        //int arr[] = new int[]{10,20};
        moveToEnd(arr);
    }
}


//Efficient Solution
// public class Lecture12_move_zeroes_to_end 
// {
//     static void moveToEnd(int ar[])
//     {   int count =0;
//         int temp=0;
//         for(int i=0;i<ar.length; i++)
//         {
//             if(ar[i] !=0)
//             {
//                 temp = ar[count];
//                 ar[count] = ar[i];
//                 ar[i] = temp;
//                 count ++;
//             }
//         }
//         for(int i=0; i<ar.length; i++)
//         {
//             System.out.println(ar[i]);
//         }
//     }
//     public static void main(String[] args) 
//     {
//         System.out.println(" ");
//         // int arr[] = new int[]{8,5,0,10,0,20};
//          int arr[] = new int[]{10,5,0,0,8,0,9,0};
//         // int arr[] = new int[]{0,0,0,10,0};
//         //int arr[] = new int[]{10,20};
//         moveToEnd(arr);
//     }
// }




//Efficient Solution think by You
// public class Lecture12_move_zeroes_to_end {
//     static int [] moveToEnd(int ar[]){
//         int temp=0;
//         int count = 0;
//         for(int i=0;i<ar.length; i++){
//             if(ar[i] ==0){
//                 count ++;
//             }
//             if(ar[i]!=0 && count!=0){
//                 temp= ar[i-count];
//                 ar[i-count]=ar[i];
//                 ar[i]= temp;
//             }
//         }
//         return ar;
//     }
//     public static void main(String[] args) {
//         System.out.println(" ");
//         // int arr[] = new int[]{8,5,0,10,0,20};
//         // int arr[] = new int[]{10,5,0,0,8,0,9,0};
//         // int arr[] = new int[]{0,0,0,10,0};
//         int arr[] = new int[]{10,20};
//         int uniqueArray[] = moveToEnd(arr);
//         for(int i=0; i<uniqueArray.length; i++){
//             System.out.println(uniqueArray[i]);
//         }
//     }
// }
