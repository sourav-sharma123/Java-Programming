// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
// import java.util.ListIterator;

// public class practise 
// {
//     public List<Integer> filter(int arr[], int k)
//     {
//         for (int i=0; i<arr.length; i++)
//         {
//             if(arr[i]<k)
//             {
//                 System.out.println(arr[i]);
//             }
//         }
//         return null;
//     }
//     public static void main(String[] args) 
//     {
//         List<Integer> arr = new ArrayList<Integer>();
//         arr.add(8);
//         arr.add(10);
//         arr.add(20);
//         arr.add(100);
//         filter(arr, 10);
//     }
    
// }



import java.util.ArrayList;
import java.util.List;
public class practise 
{
    public static List<Integer> get_smaller(int arr[],  int k)
    {
        List<Integer> al= new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]<k)
            {
                al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) 
    {
        int arr[]= {10,40,80,30, 20, 15};
        List<Integer> al = get_smaller(arr,30);   //It (get_smaller(arr,30);) return list
        for(Integer x: al)                          //traverse through the list (al)
        {
            System.out.println(x);
        }  
    }
}