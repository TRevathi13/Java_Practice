package Basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.print(a+" "+b+" ");

            for(int i=3;i<=n;i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }

        }
    }
}
