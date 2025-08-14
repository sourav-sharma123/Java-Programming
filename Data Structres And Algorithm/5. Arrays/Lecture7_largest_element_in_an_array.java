//Find largest element in an array

//Naive Approach

// public class Lecture7_largest_element_in_an_array {
//     static int get_Largest(int ar[], int cap){
//         for(int i=1; i<cap;i++){
//             boolean flag =true;
//             for(int j=0;j<cap;j++){
//                 if(ar[j]>ar[i]){
//                     flag=false; 
//                     break;
//                 }
//             } 
//             if(flag == true){
//                 return i;
//             } 
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{5,8,20,10};
//         int a= arr.length;
//         System.out.println("The largest number is at index: " + get_Largest(arr, a));

//     }
// }


//Efficient Approach (You think it and it matches with the sir's thinking approach)

public class Lecture7_largest_element_in_an_array {
    static int get_Largest(int ar[], int cap){
        int res = 0;
        for(int i =1; i<cap; i++){
            if(ar[i]> ar[res]){
                res =i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,8,20,10};
        int a= arr.length;
        System.out.println("The largest number is at index: " + get_Largest(arr, a));
    }
}