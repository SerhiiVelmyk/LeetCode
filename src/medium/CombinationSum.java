package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] array3 = {20, 41, 30, 40, 34, 43, 47, 31, 48, 29, 45, 21, 24, 35, 38, 26, 39, 25, 42, 37, 23, 28, 49, 27, 22, 32, 44, 36};
        int target3 = 70;

        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(array3, target3));
    }

    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, 0, target, 0, temp, result);

        return result;
    }

    private void helper(int[] candidates, int start, int target, int sum, List<Integer> list, List<List<Integer>> result) {
        if (sum > target)
            return;

        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            helper(candidates, i, target, sum + candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }
}
