package ArraylistbasicProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateArrayList {
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
            int first=list.get(n-1);
            res.add(first);
            for(int i=0;i<n-1;i++){
                res.add(list.get(i));
            }


            System.out.println(res);
        }
    }
}
