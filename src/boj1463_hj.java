import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class boj1463_hj {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());

        // Iteger 배열로 선언하면 null로 초기화되어 있음
        dp = new Integer[n + 1];
        // 0과 1은 0으로 초기화
        dp[0]= dp[1] = 0;

        System.out.println(one(n));
        System.out.println(Arrays.toString(dp));
    }

    public static int one(int n) {
        // 아직 계산 안된 값
        if (dp[n] == null) {
            // 6으로 나누어 떨어질경우
            if (n % 6 == 0) {
                dp[n] = Math.min(one(n-1), Math.min(one(n / 2),
                        one(n/3))) + 1;
            } else if (n % 3 == 0) { // 3으로 나누어 떨어질경우
                dp[n] = Math.min(one(n/3), one(n-1)) + 1;
            } else if (n % 2 == 0) {// 2로 나누어 떨어질경우
                dp[n] = Math.min(one(n/2), one(n-1)) + 1;
            } else {// 2, 3, 6으로 나누어 떨어지지 않을경우
                dp[n] = one(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
