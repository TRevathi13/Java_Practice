package Strings;

import java.util.Scanner;

public class countdan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int d=0,sp=0,alpha=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                    alpha++;
                }else if(ch>='0' && ch<='9'){
                    d++;
                }else{
                    sp++;
                }
            }
            System.out.println("Alphabets = " + alpha);
            System.out.println("Digits = " + d);
            System.out.println("Special Characters = " + sp);

        }
    }
}
