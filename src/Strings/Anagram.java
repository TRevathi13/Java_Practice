package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String r=sc.next();

            if(s.length()!=r.length()){
                System.out.println("not a angram");
                continue;
            }
            char[] a=s.toCharArray();
            char[] b=r.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a, b)){
                System.out.println("Anagram");
            }else{
                System.out.println("not a anagram");
            }
        }
    }
}
