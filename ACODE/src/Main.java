import java.util.Scanner;

public class Main {
    public static Integer[] dp;
    public static int n;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main.n = scanner.nextInt();
        int length = 0;
        int i = Main.n;
        while (i != 0){
            i = i /10;
            length++;
        }

        dp = new Integer[length+1];
        for(i=0; i <length+1; i++){
            dp[i] = -1;
        }
        Main m = new Main();
        System.out.print(m.solving(length));
    }
    public int solving(int length){
        if ( length <= 1 ){
            dp[0] = 1;
            dp[1] = 1;
            return 1;
        }
        else if ( dp[length] != -1 ){
            return dp[length];
        }
        else{
            int ans = 0;
            int b = Main.n % 100;
            Main.n = Main.n / 100;
            ans = solving(length-1);
            System.out.println("answ =" + ans + " "+length+" "+b);
            if ( b >= 10 && b<= 26){
                ans += solving(length - 2);

            }
            dp[length] = ans;
            return dp[length];

        }
    }
}
