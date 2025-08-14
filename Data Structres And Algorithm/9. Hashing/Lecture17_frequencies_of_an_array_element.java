//Naive Solution
import java.util.*;
public class Lecture17_frequencies_of_an_array_element
{
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;     
        countFreq(arr, n);
    }   
    static void countFreq(int arr[], int n)
    {   for(int i=0; i<n; i++){
        boolean flag = false;
        for(int j=0; j<i; j++){
            if(arr[i]==arr[j])
            {
                flag = true;
                break;
            }
        }
        if(flag==true){
            continue;
        }
        int frequency =1;
        for(int j= i+1; j<n; j++){
            if(arr[i]==arr[j]){
                frequency++;
            }
        }
        System.out.println(" The frequency of element "+ arr[i] + " is: "+ frequency);
    }
    }
}

//Efficient Solution
// import java.util.*;
// public class Lecture17_frequencies_of_an_array_element
// {
//     public static void main (String[] args) {
//         int arr[] = new int[]{15, 16, 27, 27, 28, 15};
//         int n = arr.length;     
//         countFreq(arr, n);
//     }   
//     static void countFreq(int arr[], int n)
//     {   HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
//         for(int i = 0; i < n; i++)
//         {
//             //int key = arr[i];
//             if(hmp.containsKey(arr[i]) == true)
//               hmp.put(arr[i], hmp.get(arr[i]) + 1);
//             else
//               hmp.put(arr[i], 1);    
//         }
//        for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
//         System.out.println(itr.getKey() + " " + itr.getValue());
//     }
// }


// import java.util.*;
// public class Lecture17_frequencies_of_an_array_element
// {
//     public static void main (String[] args) {
//         int arr[] = new int[]{15, 16, 27, 27, 28, 15};
//         int n = arr.length;     
//         countFreq(arr, n);
//     }   
//     static void countFreq(int arr[], int n)
//     {   HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
//         for(int i : arr)
//         {
//             hmp.put(i, hmp.getOrDefault(i, 0)+1);  //It is like hmp.put(i, count);
//         }
//        for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
//         System.out.println(itr.getKey() + " " + itr.getValue());
//     }
// }

//hmp.put(i, count) → Updates the count of i in the HashMap.
// You're thinking: "hmp.get(arr[i]) + 1" should be 28!"
// ✅ hmp.get(arr[i]) + 1 increases only the count of arr[i], not its value.
// 1️⃣ hmp.get(27) → Gets the current count of 27, which is 1.
// 2️⃣ hmp.get(27) + 1 → 1 + 1 = 2 (Increment count).
// 3️⃣ hmp.put(27, 2) → Updates 27 in hmp with the new count.
// 👉 Updated HashMap: {15=1, 16=1, 27=2}


































