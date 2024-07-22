package algorithm_nossi.graph.타겟넘버;

public class Solution1 {
    static int answer = 0;
    public static int solution(int[] numbers, int target) {
       backtrack(0,0, numbers, target);
       return answer;
    }

    static void backtrack(int cur, int idx, int[] numbers, int target) {
        //basecase
        if(idx == numbers.length) {
            if(target == cur) {
                answer++;
            }
            return;
        }

        //recursive call
        backtrack(cur + numbers[idx], idx+1, numbers, target);
        backtrack(cur - numbers[idx],idx+1, numbers, target);
    }

}
