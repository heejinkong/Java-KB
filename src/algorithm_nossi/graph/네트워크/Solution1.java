package algorithm_nossi.graph.네트워크;

public class Solution1 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, n, computers,visited);
                answer++;
            }

        }
        return answer;
    }
    void dfs(int cur, int n, int[][] computers, boolean[] visited) {
        visited[cur] = true;

        for (int i = 0; i < n; i++) {
            if(computers[cur][i] == 1) {
                if(!visited[i])
                    dfs(i, n, computers, visited);
            }
        }

    }
}
