package Basics;

import java.util.Scanner;

public class FactorNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            for(int i=n;i<n;i++){
                if(i==0) continue;
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
