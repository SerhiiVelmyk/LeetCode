package medium;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(array));
    }

    private static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }
        return res;

//        List<Integer> list = new ArrayList<>();
//        Arrays.sort(nums);
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1]) {
//                list.add(nums[i]);
//            }
//        }
//
//        return list;
    }
}
