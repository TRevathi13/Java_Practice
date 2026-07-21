package Strings;

import java.util.Scanner;

public class FindFirstReapedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();

            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(s.indexOf(ch)!=s.lastIndexOf(ch)){
                    System.out.println(ch);
                    break;
                }

            }

        }
    }
}
