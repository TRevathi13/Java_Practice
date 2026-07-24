package ArraylistbasicProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            ArrayList<Integer> res=new ArrayList<>();

            for(int i=list.size()-1;i>=0;i--){
                res.add(list.get(i));
            }
            System.out.println(res);
        }
    }
}
