package Basics;

import java.util.Scanner;
public class greatesofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=sc.nextInt();
            /*if(a>b){
                if(a>c){
                    System.out.println(a+ "a is large");
                }else{
                    System.out.println(c+ "c is large");
                }
            }else {
                if(b>c) System.out.println(b+" b is lar");
                else System.out.println(c +" c is lar");
            }*/

            int large=a;
            if(b>large) large=b;
            if(c>large) large=c;
            System.out.println(large);
        }
    }
}