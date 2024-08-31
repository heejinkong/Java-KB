package algorithm_nossi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주라지못한선수_HashTable {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution(participant, completion));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for(String player : completion) {
            map.put(player, map.get(player)-1);
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }


        return answer;

    }
}
