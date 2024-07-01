package javacollection;

import java.util.ArrayList;

public class Q1_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("박소정");
        list.add("김경민");
        list.add("소지현");
        list.add("김개빈");

        System.out.println("초기 참가자 목록: " + list );

        list.remove(1);
        System.out.println("탈락 후 참가자 목록: " + list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+"등: " + list.get(i));
        }

    }
}
