                                                //Search an item in an array 
import java.util.Scanner;
public class Lecture5_search_and_insert{
    static int search(int ar[],int x){
        for(int i =0; i<ar.length;i++){
            if(ar[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array");
        int a = sc.nextInt();
        int []arr = new int[a];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int b = sc.nextInt();
        System.out.println(search(arr,b));
    }
}

//Insert an item in an array at a given position
// import java.util.Scanner;
// public class Lecture5_search_and_insert{
//     static int search(int ar[],int cap,int ele, int x,int pos){
//         if(ele == cap){
//             return ele;
//         }
//         int temp;
//         for(int i=ele-1;i>=pos;i-- ){
//             ar[i+1] = ar[i];
//         }
//         ar[pos]=x;
//         return ele+1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements you want in your array");
//         int a = sc.nextInt();
//         int []arr = new int[a];
//         arr[0]=5; arr[1]=10; arr[2]=20;
//         int n=3;
//         System.out.println("Enter the number you want to insert");
//         int b = sc.nextInt();
//         System.out.println("Enter the position you want to insert");
//         int c = sc.nextInt();
//         n=search(arr,a,n,b,c);
//         for(int i=0; i<a;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

