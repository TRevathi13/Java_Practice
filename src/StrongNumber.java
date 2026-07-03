import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int org=n;
            int sum=0;
            while(n>0){
                int digit=n%10;
                int fact=1;
                for(int i=1;i<=digit;i++){
                    fact=fact*i;

                }
                sum+=fact;
                n=n/10;
            }
            if(org==sum) System.out.println("strong num");
            else System.out.println("not strong num");
        }
    }
}
