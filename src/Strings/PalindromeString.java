package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            String rev="";
            for(int i=s.length()-1;i>=0;i--){
                rev+=s.charAt(i);
            }
            if(s.equals(rev)){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }
    }
}
