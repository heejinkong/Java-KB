import java.util.Scanner;

public class boj1463_bottomUp_hj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] dp = new Integer[n+1];
        dp[0] = dp[1] = 0;

        for(int i = 0; i <dp.length; i++) {
            if(dp[i] == null) {
                if(i % 6 == 0 ) {
                    dp[i] = Math.min(dp[i-1], Math.min(dp[i/2], dp[i/3])) + 1;
                } else if (i % 3 == 0 ) {
                    dp[i] = Math.min(dp[i-1], dp[i/3])+1;
                } else if (i % 2 == 0) {
                    dp[i] = Math.min(dp[i-1], dp[i/2])+1;
                } else {
                    dp[i] = dp[i-1] + 1;
                }

                }
            }
        System.out.println(dp[n]);
    }
}
