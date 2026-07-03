import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean isprime=true;

            if(n<=1) isprime=false;

            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }

            System.out.println(isprime ?"prime":"not prime");



        }
    }
}
