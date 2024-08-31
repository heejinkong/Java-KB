package algorithm_nossi.graph.타겟넘버;

public class Solution {
    static boolean[] visited;
    static int[] booho = {-1,1};
    static int answer = 0;
    public static int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        dfs(numbers, target, 0, 0);

        return answer;
    }

    public static void dfs(int[] numbers, int target, int cur, int depth) {
        if(depth == numbers.length && cur == target) {
            answer++;
            return;
        } else if (depth == numbers.length) {
            return;
        }

        for(int i=0; i< booho.length; i++) {
            if(!visited[depth]) {
                visited[depth] = true;
                int newValue = cur + numbers[depth]*booho[i];
                dfs(numbers, target, newValue, depth+1);

                visited[depth] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }
}
