                                                //Print Subset of the given string
public class Lecture13 {
    static void printSub(String s, String curr, int index){
        if(index == s.length()){
            System.out.println(curr + " ");
            return;
        }
        printSub(s, curr, index+1);
        printSub(s, curr+s.charAt(index), index+1);
    }
    public static void main(String[] args) {
        String str = "ABC";
        String currr="";
        int index = 0;
        printSub(str, currr, index);
    }
}
