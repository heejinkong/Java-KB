package algorithm_nossi.graph.단어변환;
import java.util.*;
public class Solution1 {
    public int solution(String begin, String target, String[] words) {
        Queue<WordState> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        //✅ begin을 큐에 추가한다.
        queue.add(new WordState(0, begin));

        //✅ BFS 탐색을 통해 정답을 구한다.
        while (!queue.isEmpty()) {
            WordState cur = queue.remove();
            if (cur.word.equals(target)) return cur.cnt;

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && getDiffCount(cur.word, words[i]) == 1){
                    visited[i] = true;
                    queue.add(new WordState(cur.cnt + 1, words[i]));
                }

            }
        }

        return 0;
    }

    int getDiffCount(String word, String target) {
        int diffCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) diffCount++;
        }

        return diffCount;
    }

    class WordState {
        int cnt;
        String word;

        WordState(int cnt, String word) {
            this.cnt = cnt;
            this.word = word;
        }
    }
}