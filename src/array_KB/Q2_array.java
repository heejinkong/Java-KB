package array_KB;

import java.util.Scanner;

public class Q2_array {
    public static void main(String[] args) {
        String[] products = {"샌드위치", "바게트", "주문 종료"};
        int[] prices = {2000, 3500, 0};
        int sum = 0;

        int sandwichQuantity = 0;
        int baguetteQuantity = 0;

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("주문할 상품을 선택하세요 (1: 샌드위치, 2: 바게트, 0: 주문 종료):");
            int order = sc.nextInt();

            switch(order) {
                case 1:
                    System.out.println("선택한 상품: " + products[0]);
                    System.out.println("주문할 수량을 입력하세요: ");
                    int sandwichCount = sc.nextInt();
                    sandwichQuantity += sandwichCount;
                    sum += prices[0] * sandwichCount;
                    break;
                case 2:
                    System.out.println("선택한 상품: " + products[1]);
                    System.out.println("주문할 수량을 입력하세요: ");
                    int baguetteCount = sc.nextInt();
                    baguetteQuantity += baguetteCount;
                    sum += prices[1] * baguetteCount;
                    break;
                case 0:
                    System.out.println();
                    System.out.println("최종 주문 내역:");
                    System.out.println(products[0] + ": " + sandwichQuantity + "개");
                    System.out.println(products[1] + ": " + baguetteQuantity + "개");
                    System.out.println("최종 주문 가격:" + sum + "원");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }

            System.out.println();
            System.out.println("현재 주문 상황:");
            System.out.println(products[0] + ": " + sandwichQuantity + "개");
            System.out.println(products[1] + ": " + baguetteQuantity + "개");
            System.out.println("현재까지의 총 주문 금액:" + sum + "원");
        }
    }
}
