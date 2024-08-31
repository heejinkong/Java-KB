package algorithm_nossi;

import java.util.ArrayList;
import java.util.Arrays;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i  < num; i++) {
            if(num % i == 0) return false;
        }
       return true;
    }
    public static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i +1; j < nums.length; j++) {
                for(int k = j +1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)){
                        arr.add(sum);
                    }

                }
            }
        }

        answer = arr.size();

        return answer;
    }
}
