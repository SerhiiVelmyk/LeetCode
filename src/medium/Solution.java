package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {
    private int[] origin;
    List<Integer> list = new ArrayList<>();

    private Solution(int[] nums) {
        origin = new int[nums.length];
        origin = nums;
    }

    private int[] reset() {
        return origin;
    }

    private int[] shuffle() {
        int[] shuffled = new int[origin.length];

        for (int i = 0; i < origin.length; i++) {
            shuffled[i] = origin[getRandomInt()];
        }

        list.clear();

        return shuffled;
    }

    private int getRandomInt() {
        Random random = new Random();
        int value;
        do {
            value = random.nextInt(origin.length);
        } while (list.contains(value));
        list.add(value);

        return value;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        Solution obj = new Solution(nums);
        int[] param_3 = obj.shuffle();
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();

        System.out.println(Arrays.toString(param_1));
        System.out.println(Arrays.toString(param_2));
        System.out.println(Arrays.toString(param_3));
    }
}
