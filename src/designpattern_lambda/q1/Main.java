package designpattern_ambda.q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectFactory factory = new ObjectFactory();

        while (true) {
            System.out.print("어떤 객체를 생성하시겠습니까? (Apple, Banana, Ice): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Object obj = factory.createObject(input);
            if (obj != null) {
                System.out.println(input + "가(이) 입력되었습니다.");
                System.out.println();
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
