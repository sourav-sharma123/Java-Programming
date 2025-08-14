                                                    //Josephus Problem
//If n starts from 0.
// import java.util.Scanner;
// class GFG 
// { 
    
//     static int jos(int n, int k)
//     {
//     	if(n == 1)
//     		return 0;
//     	else
//     		return (jos(n - 1, k) + k) % n;
//     }
   
//     public static void main(String args[]) 
//     { 
//         System.out.println(jos(5, 3));  
//     } 
// }


//Advance Version of above code


import java.util.*;
public class Lecture15
{ 
    static int jos(int n, int k)
    {
    	if(n == 1){
    		return 0;
        }
    	else{
    		return (jos(n - 1, k) + k) % n;
        }
    }
    static int myJos(int n, int k)
    {
    	return jos(n, k) + 1;
    }
    public static void main(String args[]) 
    { 
        System.out.println(myJos(5, 3));  
    } 
}