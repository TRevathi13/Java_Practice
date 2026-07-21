package Strings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();

            for(int i=0;i<s.length();i++){
                boolean isfound=false;

                for(int j=0;j<i;j++){
                    if(s.charAt(i)==s.charAt(j)){
                        isfound=true;
                        break;
                    }
                }
                if(!isfound) System.out.println(s.charAt(i)+" ");
            }
        }
    }
}
