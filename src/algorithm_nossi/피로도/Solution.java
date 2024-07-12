package algorithm_nossi.피로도;

import java.util.List;

class Solution {
    int answer = 0;
    boolean[] visited;
    int n;
    public int solution(int k, int[][] dungeons) {
        n = dungeons.length;
        visited = new boolean[n];
        backtrack(k, dungeons, 0);
        return answer;
    }
    //
    public void backtrack(int cur_k, int[][] dungeons, int cnt) {
        // basecase
        if(cnt > answer) {
            answer = cnt;
        }
        //recursive call
        for(int i = 0; i < n; i++) {
            if(cur_k >= dungeons[i][0] && !visited[i]){
                visited[i] = true;
                backtrack(cur_k - dungeons[i][1],dungeons, cnt+1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        algorithm_nossi.피로도.Solution solution = new algorithm_nossi.피로도.Solution();
        int k = 80;
        int dungeons[][] = {{80,20},{50,40},{30,60},{20,80}};
        int result = solution.solution(k, dungeons);
        System.out.println(result);
    }
}
