package array_KB;

public class Q3_array {
    public static void main(String[] args) {
        int[] answer = new int[1000];
        int[] my_answer = new int[1000];
        int cnt = 0;

        //answer 랜덤하게 1~4로 초기화
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)(Math.random() * 4) + 1;
            my_answer[i] = (int)(Math.random() * 4) + 1;
        }

        for(int i = 0; i < answer.length; i++) {
            if(answer[i] == my_answer[i]) {
                cnt++;
            }
        }

        System.out.println("Index     Correct Answer     My Answer");
        for(int i = 0; i < answer.length; i++) {
            System.out.println(i + "         " + answer[i] + "                  " + my_answer[i]);
        }
        System.out.println("맞춘 개수: "+cnt);
    }
}
