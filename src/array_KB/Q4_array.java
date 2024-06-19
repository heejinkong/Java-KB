package array_KB;
import java.util.Arrays;

public class Q4_array {
    public static void main(String[] args) {
        String[] subject = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] score1 = {44, 66, 22, 99, 100};
        int[] score2 = score1.clone();

        score2[0] = 22;
        score2[2] = 88;

        int same = 0;
        int up = 0;

        for(int i = 0 ; i < score1.length; i++) {
            if(score1[i] == score2[i]) {
                same++;
            }
            if(score1[i] < score2[i]) {
                up++;
            }


        }

        System.out.println("1학기 성적: " + Arrays.toString(score1));
        System.out.println("2학기 성적: " + Arrays.toString(score2));
        System.out.println("1학기와 2학기 성적이 동일한 과목 수: " + same);
        System.out.println("1학기보다 성적이 오른 과목 수: "+ up);
        for(int i = 0; i < score1.length; i++) {
            if(score1[i] < score2[i]) {
                System.out.println("성적이 오른 과목명: "+subject[i]);
            }
        }



    }
}
