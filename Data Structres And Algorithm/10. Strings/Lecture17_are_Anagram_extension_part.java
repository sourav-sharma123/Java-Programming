//Naive Solution
// import java.util.Scanner;
// public class Lecture17_are_Anagram_extension_part {
//     static final int CHAR=256;
//     static boolean areAnagram(String pat, String txt,int i) 
//     { 
//         int[] count=new int[CHAR];
//         for(int j=0;j<pat.length();j++)
//         {
//             count[pat.charAt(j)]++;
//             count[txt.charAt(i+j)]--;
//         }
//         for(int j=0;j<CHAR;j++)
//         {
//             if(count[j]!=0)
//                 return false;
//         }
//         return true;
//     } 
//     static boolean isPresent(String txt,String pat)
//     {
//         int n=txt.length();
//         int m=pat.length();
//         for(int i=0;i<=n-m;i++)
//         {
//             if(areAnagram(pat,txt,i))
//                 return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first string");
//         String txt = sc.nextLine();
//         System.out.println("Enter the rotated string");
//         String pat = sc.nextLine();
//         if (isPresent(txt, pat)) 
//             System.out.println("Anagram search found"); 
//         else
//             System.out.println("Anagram search not found"); 
//     }
// }

//Efficient Solution
import java.util.Scanner;
public class Lecture17_are_Anagram_extension_part {
    static final int CHAR=256;
    static boolean areSame(int CT[],int CP[])
    {
        for(int i=0;i<CHAR;i++)
        {
            if(CT[i]!=CP[i])
                return false;
        }
        return true;
    }
    static boolean isPresent(String txt,String pat)
    {
        int[] CT=new int[CHAR];int[] CP=new int[CHAR];
        for(int i=0;i<pat.length();i++)
        {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++)
        {
            if(areSame(CT,CP))
                return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String txt = sc.nextLine();
        System.out.println("Enter the rotated string");
        String pat = sc.nextLine();
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found"); 
    }
}

// import java.util.Scanner;
// public class Lecture17_are_Anagram_extension_part {
//     static boolean areAnagram(String txt, String pat)
//     {
//         return((txt).indexOf(pat)>=0);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first string");
//         String s1 = sc.nextLine();
//         System.out.println("Enter the rotated string");
//         String s2 = sc.nextLine();
//         System.out.println(areAnagram(s1,s2));
//     }
// }
