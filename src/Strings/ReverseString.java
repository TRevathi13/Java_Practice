package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            String rev="";
            for(int i=s.length()-1;i>=0;i--){
                char ch=s.charAt(i);
                rev+=ch;
            }
            System.out.println(rev);
        }
    }
}
