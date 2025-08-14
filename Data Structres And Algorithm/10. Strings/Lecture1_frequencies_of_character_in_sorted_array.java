//In Java

import java.util.*;
public class Lecture1_frequencies_of_character_in_sorted_array
{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int [] count = new int[26];
        for(int i=0; i<str.length(); i++)
        {
            count[str.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++)
        {
            if(count[i] > 0)
            {
                System.out.println((char)(i + 'a') + " " + count[i]);
            }
        } 
    }
}

//In C++

// #include <stdio.h>
// using namespace std;
// int main()
// {
//     String str = "geeksforgeeks";
//     int count[26] ={0};
//     for(int i=0; i<str.length(); i++)
//     {
//         count[str[i] - 'a']++;
//     }
//     for(int i=0; i<26; i++)
//     {
//         if(count[i] > 0)
//         {
//             cout<<char(i + 'a') << " " <<count[i]<<endl;
//         }
//     } 
// }