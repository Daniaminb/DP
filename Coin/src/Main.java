import java.util.Scanner;

public class Main {
    public static Integer[] dp;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        dp = new Integer[n];
        for(int i=0; i < n; i++){
            dp[i] = -1;
        }
        Main m = new Main();
        System.out.print(m.solving(n));
    }

    public int solving(int n){
        if ( n == 0){
            return 0;
        }
        else if (dp[n-1] != -1){
            return dp[n-1];
        }
        else{
            int i = n/4;
            int j = n/3;
            int k = n/2;
            int num = solving(i)+solving(j)+solving(k);
            if ( n > num ){
                dp[n-1] = n;
            }
            else
            {
                dp[n-1] = num;
            }
            return dp[n-1];
        }
    }
}
