import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int year = sc.nextInt();
            /*if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("leap");
            } else {
                System.out.println("not leap");
            }*/
            /*boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            if (leap) {
                System.out.println("yes");
            } else {
                System.out.println("NO");
            }*/
            String res = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? "leap" : "not leap";
            System.out.println(res);
        }
    }
}
