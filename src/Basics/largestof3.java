package Basics;

import java.util.*;
public class largestof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
            int largest=Math.max(a, Math.max(b,c));

            /*int largest=a;
            if(b>largest){
                largest=b;
            }
            if(c>largest){
                largest=c;
            }*/
            System.out.println(largest);

        }
    }
}
