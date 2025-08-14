                                            //Frequencies in an sorted array
public class Lecture17_frequencies_in_a_sorted_array
{   static void printFreq(int arr[], int n)
    {   int freq = 1, i = 1;
    	while(i < n)
    	{   while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}
    		System.out.println(arr[i - 1] + " " + freq);
    		i++;
    		freq = 1;
    	}
    }
    public static void main(String args[]) 
    {   System.out.println(" ");
        int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;
       printFreq(arr, n);
    } 
}

//Efficient Solution think by You
// public class Lecture17_frequencies_in_a_sorted_array {
//     static void frequency(int ar[]){
//         int count =1;
//         for(int i=1; i<ar.length; i++){
//             if(ar[i-1]==ar[i]){
//                 count++;
//             }
//             if(ar[i-1]!=ar[i] ){
//                 System.out.println("The frequency of number " + ar[i-1] +" is: " +count);
//                 count =1;
//             }
//             if(i==ar.length-1){
//                 System.out.println("The frequency of number " + ar[i] +" is: " +count);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,10,10,25,30,30,35};
//         frequency(arr);
//     }
// }


