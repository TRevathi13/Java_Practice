package Strings;

import java.util.Scanner;

public class CountFreqOfEachChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();

            boolean[] isvisited=new boolean[s.length()];
            for(int i=0;i<s.length();i++) {
                if (isvisited[i]) {
                    continue;
                }
                int count = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        isvisited[j] = true;
                    }

                }
                System.out.println(s.charAt(i) + " " + count);
            }
        }
    }
}
