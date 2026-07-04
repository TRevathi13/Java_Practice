package Basics;

import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int res=(int) Math.pow(n, 2);
            System.out.println(res);
            }
        }
    }

