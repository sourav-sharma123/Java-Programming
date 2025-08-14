import java.util.Scanner;

public class Lecture12_improved_naive_pattern_searching {
    static void impPatSearching(String txt, String pat)
    {
        int n = txt.length();
        int m = pat.length();
        for( int i=0; i<=(n-m); )
        {
            int j;
            for(j=0; j<m; j++)
            {
                if(txt.charAt(i+j)!=pat.charAt(j))
                {
                    break;
                }
            }
            if(j==m)
            {
                System.out.println(i+" ");
            }
            if(j==0)
            {
                i++;
            }
            else
            { 
                i=i+j;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main text");
        String txt = sc.nextLine();
        System.out.println("Enter the pattern");
        String pat = sc.nextLine();
        impPatSearching(txt, pat);

    }
}
