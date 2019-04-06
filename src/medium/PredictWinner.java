package medium;

import java.util.Arrays;

public class PredictWinner {

    public static void main(String[] args) {
        int[] array = {0, 0, 7, 6, 5, 6, 1};

        PredictWinner predictWinner = new PredictWinner();
        System.out.println(predictWinner.PredictTheWinner(array));
    }


    private boolean PredictTheWinner(int[] nums) {
        if (nums.length % 2 == 0 || nums.length == 1) {
            return true;
        }

        if (nums.length == 3) {
            return nums[1] < nums[0] + nums[2];
        }

        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sumFirst += nums[i];
        }

        for (int i = 1; i < nums.length; i = i + 2) {
            sumSecond += nums[i];
        }

        Arrays.sort(nums);
        int maxMin = nums[nums.length - 1] - nums[0];

        double diff = (double) sumFirst / sumSecond;

        return diff <= 2 && diff >= 1 && maxMin * 2 <= sumFirst;
    }
}
