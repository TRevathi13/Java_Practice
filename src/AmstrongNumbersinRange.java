import java.util.Scanner;
public class AmstrongNumbersinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int start=sc.nextInt();
            int end=sc.nextInt();
            for(int n=start;n<=end;n++){
                int org=n;
                int temp=n, count=0;
                int sum=0;
                while(temp>0){
                    temp=temp/10;
                    count++;
                }temp=n;
                while(temp>0){
                    int digit=temp%10;
                    sum=sum+(int) Math.pow(digit, count);
                    temp=temp/10;
                }
                if(org==sum) System.out.print(n+" ");
            }
        }

    }
}
