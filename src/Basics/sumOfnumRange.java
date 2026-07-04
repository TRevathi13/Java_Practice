package Basics;

import java.util.Scanner;
public class sumOfnumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}