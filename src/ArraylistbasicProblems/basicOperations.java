package ArraylistbasicProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class basicOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(76);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(77));
        System.out.println(list.remove(0));
        System.out.println(list.set(1,15));
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.isEmpty());


    }
}
