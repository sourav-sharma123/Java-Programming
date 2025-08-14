import java.util.Scanner;

public class Lecture13_rabin_karp_algorithm {
    static final int d = 256;
    static final int q = 101;
    static void rabin_karp(String txt, String pat, int x, int y)
    {
        int h=1;
        for(int i=1; i<=x-1; i++)
        {
            h= (h*d)%q;
        }
        int p=0,t=0;
        for(int i=0; i<x; i++)
        {
            p=(p*d + pat.charAt(i))%q;
            t=(t*d + txt.charAt(i))%q;
        }
        for(int i=0; i<=(y-x); i++)
        {
            if(p==t)
            {
                boolean flag = true;
                for(int j=0;j<x; j++)
                {
                    if(txt.charAt(i+j)!=pat.charAt(j))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                {
                    System.out.println(i+ " ");
                }
            }
            if(i<x-y)
            {
                t= ((d*(t-txt.charAt(i)*h))+ txt.charAt(i+x))%q;
                if(t<0)
                {
                    t=t+q;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main text");
        String txt = sc.nextLine();
        System.out.println("Enter the pattern");
        String pat = sc.nextLine();
        int x = pat.length();
        int y = txt.length();
        rabin_karp(txt,pat, x, y);
    }
}
