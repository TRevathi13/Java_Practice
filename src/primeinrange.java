
import java.util.Scanner;
public class primeinrange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int n = start; n <= end; n++) {

                boolean isPrime = true;

                if (n <= 1) {
                    isPrime = false;
                }

                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(n);
                }
            }
        }
    }
}
