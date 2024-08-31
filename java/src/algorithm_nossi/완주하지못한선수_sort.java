package algorithm_nossi;

import java.util.Arrays;

//시간초과

public class 완주하지못한선수_sort {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution(participant, completion));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        //정렬 -> 0( m * nlogn )
        Arrays.sort(participant);
        Arrays.sort(completion);

        //i 0 ~ n-1 순회 -> 0(n)
        for (int i = 0; i < completion.length; i++) {
            //문자열 비교
            participant[i].equals(completion[i]);
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
            }
        }
        //마지막 선수가 완주하지 못한 경우
        answer = participant[participant.length-1];

        return answer;
    }
}
