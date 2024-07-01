package javacollection;

import java.util.LinkedList;
import java.util.Queue;

public class Q1_2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("국어");
        queue.add("수학");
        queue.add("영어");
        queue.add("컴퓨터");

        System.out.println("처음 시험별 과목: " + queue);

        for(int i = 1; i < 4; i++) {
            queue.poll();
            System.out.println(i+"회차 시험을 한 날은 과목: " + queue);
        }


    }
}
