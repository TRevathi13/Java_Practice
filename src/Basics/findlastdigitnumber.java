package Basics;

import java.util.Scanner;

public class findlastdigitnumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
                int b=Math.abs(a);
                int res=b%10;
                System.out.println(res);
            }
        }
}
