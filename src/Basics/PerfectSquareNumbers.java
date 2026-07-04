package Basics;

import java.util.Scanner;
    public class PerfectSquareNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int square=(int) Math.sqrt(n);

                if(square*square==n) System.out.println("Perfect square");
                else System.out.println( "Not Perfect Square Num");

        }
    }
}
