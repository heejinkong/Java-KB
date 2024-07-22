package algorithm_nossi.graph.네트워크;

public class Solution {
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];

        for(int i = 0; i < computers.length; i++) {
            if(visited[i] == false) {
                answer++;
                dfs(i, visited, computers);
            }
        }
        return answer;
    }

    public static void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;

        for(int i = 0; i < computers.length; i++) {
            if(visited[i] == false && computers[node][i] == 1) {
                dfs(i, visited, computers);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int[][] computers = {{1, 1, 0},{1, 1, 0},{0, 0, 1}};
        System.out.println(solution(n,computers));
    }
}
