package javacollection;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        // ArrayList 객체 생성 (제네릭 타입을 지정하지 않음)
        ArrayList list = new ArrayList();

        // 문자열 "자바" 추가 (자동 형변환: String -> Object)
        list.add("자바");

        // 사람 객체 추가 (자동 형변환: 사람 -> Object)
//        list.add(new 사람());

        // ArrayList 객체 추가 (자동 형변환: ArrayList -> Object)
        list.add(new ArrayList());

        // 첫 번째 요소를 String 타입으로 강제 형변환 (Object -> String)
        String s = (String) list.get(0);

        // 정수 100 추가 (박싱: int -> Integer, 자동 형변환: Integer -> Object)
        list.add(100);

        // 네 번째 요소를 Integer 타입으로 강제 형변환 (Object -> Integer)
        // 그리고 언박싱하여 int로 변환 (Integer -> int)
        int i = (Integer) list.get(3);
    }
}
