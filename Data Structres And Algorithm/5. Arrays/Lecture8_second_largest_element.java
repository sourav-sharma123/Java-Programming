//Find Second largest element
                                                    //Naive Approach
// public class Lecture8_second_largest_element {
//     static int greates(int ar[]){
//         int i;
//         int n =ar.length;
//         int res= 0;
//         for(i=1; i<n;i++){
//             if(ar[i]>ar[res]){
//                 res=i;
//             }
//         }
//         return res;
//     }
//     static int secondLargest(int ar[]){
//         int res=-1;                                //if (10,10,10) jaisi condition aa jaye 
//         for(int j=0; j<ar.length;j++){
//             if(ar[j]!=ar[greates(ar)]){
//                 if(res==-1){                       //yha se res ki value 0 hogi
//                     res= j;
//                 }
//                 else if(ar[j]>ar[res]){
//                     res= j;
//                 }
//             }
//         }
//         return res;
//     }
//     public static void main (String [] args){
//         int arr[] = new int[]{5,20,12,20,10};
//         System.out.println("The index value is: " + secondLargest(arr));
//     }
// }


//Efficient Approach
public class Lecture8_second_largest_element {
    static int secondLargest(int ar[]){
        int res=-1;                                //if (10,10,10) jaisi condition aa jaye 
        int largest =0;
        for(int i=1; i<ar.length;i++){
            if(ar[i]>ar[largest]){
                res= largest;
                largest =i;
            }
            else if(ar[i]!= ar[largest]){
                if(res== -1 || ar[i]> ar[res]){
                    res =i;
                }
            }
        }
            return res;
        }
    public static void main (String [] args){
        // int arr[] = new int[]{5,20,12,20,10};
        int arr[] = new int[]{10,5,10};
        System.out.println("The index value is: " + secondLargest(arr));
    }
}