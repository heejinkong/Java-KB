import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class boj10826_hj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//       int[] dp = new int[num+1];

        //BigInteger: int의 범위를 넘어서는 큰 수 다룸
        BigInteger[] dp = new BigInteger[num+1];
        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);


        for(int i = 2; i < dp.length; i++) {
//            dp[i] = dp[i-2] + dp[i-1];
            dp[i] =  dp[i-1].add(dp[i-2]);
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[num]);
    }
}
