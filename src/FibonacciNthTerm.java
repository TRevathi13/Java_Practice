import java.util.Scanner;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=0;

            if(n==1) System.out.print(a);
            if(n==2) System.out.println(b);

            for(int i=3;i<=n;i++){
                c=a+b;
               a=b;
               b=c;

            }
            System.out.print(c+" ");
        }
    }
}
