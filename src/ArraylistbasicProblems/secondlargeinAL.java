package ArraylistbasicProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class secondlargeinAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int first=Integer.MIN_VALUE;
            int second=Integer.MIN_VALUE;
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }

            for(int i=0;i<list.size();i++){
                if(list.get(i)>first){
                    second=first;
                    first=list.get(i);
                }else if(list.get(i)>second && list.get(i)!=first){
                    second=list.get(i);
                }
            }
            System.out.println(first +" " +second);

        }
    }
}
