package algorithm_nossi.combinations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1,n,k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start,int n, int k,List<Integer> curr, List<List<Integer>> result) {
        // basecase
        if(curr.size() == k) {
            result.add(new ArrayList<>(curr));
            return;
        }

        //recursive call
        for(int i = start; i <= n; i++){
            curr.add(i);
            backtrack(i+1, n, k, curr, result);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new algorithm_nossi.combinations.Solution();
        int n = 4;
        int k = 2;
        List<List<Integer>> result = solution.combine(n,k);
        System.out.println(result);
    }
}
