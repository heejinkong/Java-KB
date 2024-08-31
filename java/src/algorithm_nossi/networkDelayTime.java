package algorithm_nossi;

import java.util.*;
import java.util.stream.Collectors;

public class networkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        //✅ 인풋을 본인이 쓰기 편한 구조로 바꾸기 => 방향 그래프 만들기
        Map<Integer, List<int[]>> edges = Arrays.stream(times)
                .collect(Collectors.groupingBy(t -> t[0]));
        int[] visited = new int[n+1];
        Arrays.fill(visited, Integer.MAX_VALUE);
        // 큐에는 { 정점, 거리 } 형태의 배열이 들어간다.
        Queue<int[]> pq = new PriorityQueue<>((e1, e2) -> e1[1] - e2[1]);
        pq.add(new int[]{ k, 0 });
        visited[k] = 0;

        //✅ k로부터 모든 노드들의 최단거리 구하기 => 다익스트라 알고리즘 수행
        int maxTime = 0;
        int visitCount = 1;
        while (!pq.isEmpty()) {
            int[] cur = pq.remove();
            int u = cur[0], time = cur[1];
            if (visited[u] < time) continue;
            maxTime = time;

            // 연결된 모든 간선에 대해 탐색한다.
            if (!edges.containsKey(u)) continue;
            for (int[] edge : edges.get(u)) {
                int v = edge[1], w = edge[2];
                // 이미 더 짧은 거리로 방문한 적이 있는 경우 건너뛴다.
                if (time + w >= visited[v]) continue;

                // 처음 방문했다면 visitCount++
                if (visited[v] == Integer.MAX_VALUE) visitCount++;
                //✅ 다익스트라가 수행되며 각 노드까지의 최단 거리 저장
                visited[v] = time + w;
                pq.add(new int[]{ v, time + w });
            }
        }
        //✅ k노드로 부터 도달할 수 없는 노드가 존재하는 경우 -1을 반환한다.
        //✅ 그 외의 경우 저장된 최단 거리 중 최대값을 반환한다.
        return visitCount == n ? maxTime : -1;
    }
}
