import java.util.Scanner;

//재귀
public class boj10826_topDown_hj {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if( n > 1 ) {
            dp[n] = fibo(n-1) + fibo(n-2);
        }
        return dp[n];
    }
}
