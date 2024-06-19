package array_KB;

import java.util.Scanner;

public class Q1_array {
    public static void main(String[] args) {
        String[] movies = { "Quiet Place", "Avegers", "Inception", "Parasite", "Interstellar" };
        String[] prices = { "15,000원", "23,000원", "18,000원", "21,000원", "19,0000원" };

        for(int i = 0; i< movies.length; i++) {
            System.out.println((i+1) + ". " + movies[i] + " - " + "조희수: " + prices[i] );
        }
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5) : ");

        int num = sc.nextInt();

        System.out.println("선택한 영화: " + movies[num - 1]);
        System.out.println("조희수: " + prices[num - 1]);

    }
}
