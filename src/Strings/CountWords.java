package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            /*String words[]=s.split(" ");
            System.out.println(words.length);*/
            int count=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ')
                    count++;
            }
            System.out.println(count);
        }
    }
}
