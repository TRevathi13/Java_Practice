import java.util.Scanner;

public class PowerOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int base = sc.nextInt();
            int exponent=sc.nextInt();
            int res=1;
            if(exponent>0){
                for(int i=1;i<=exponent;i++){
                    res=res*base;
                }
            }
            System.out.println(res);

        }
    }
}
