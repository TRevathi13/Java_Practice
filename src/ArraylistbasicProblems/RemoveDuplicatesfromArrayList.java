package ArraylistbasicProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesfromArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
            ArrayList<Integer> res=new ArrayList<>();

            for(int num: list){
                if(!res.contains(num)){
                    res.add(num);
                }
            }
            System.out.println(res);



        }
    }
}
