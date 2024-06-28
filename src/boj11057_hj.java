import java.util.Arrays;
import java.util.Scanner;

public class boj11057_hj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n+1][10];

        // n=1일때는 모든 수의 오르막 길이 1개
        Arrays.fill(dp[1], 1);

        //i=n, j=0~9
        for(int i = 2; i <= n; i++){
            for(int j=0; j < 10; j++) {
                for(int k=0; k<=j; k++){
                    dp[i][j] += dp[i-1][k]; //이전 단계의 값을 더해줌
                    dp[i][j] %= 10007; // 결과를 1007로 나눈 나머지를 저장
                }
            }

        }
// 최종적으로 길이가 n인 오르막 수의 총합을 계산
        int sum = 0;
        for(int i=0; i<10; i++) {
            sum += dp[n][i]; // 길이가 n인 경우의 모든 오르막 수를 더함
        }
        System.out.println(sum % 1007); // 최종 결과를 1007로 나눈 나머지를 출력
    }
}
