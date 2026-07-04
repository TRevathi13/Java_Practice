package Basics;

import java.util.Scanner;

public class AmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int org=n;
            int temp=n;
            int count=0;
            int sum=0;
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            temp=n;
            while(temp!=0){
                int d=temp%10;
                sum+=(int)Math.pow(d,count);
                temp=temp/10;
            }
            if(org==sum) System.out.println("amstrong");
            else System.out.println("not amstrong");
        }
    }

}
