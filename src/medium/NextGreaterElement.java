package medium;

import java.util.Arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();

        int[] array = {1, 2, 1};

        System.out.println(Arrays.toString(nextGreaterElement.nextGreaterElements(array)));
    }

    private int[] nextGreaterElements(int[] nums) {
        int[] output = new int[nums.length];

        int maxValue = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxValue) {
                output[i] = -1;
            } else {
                int[] rightPart = Arrays.copyOfRange(nums, i, nums.length);
                int[] leftPart = Arrays.copyOfRange(nums, 0, i);
                boolean inRightPart = false;

                for (int i1 : rightPart) {
                    if (nums[i] < i1) {
                        inRightPart = true;
                        output[i] = i1;
                        break;
                    }
                }

                if (!inRightPart) {
                    for (int i1 : leftPart) {
                        if (nums[i] < i1) {
                            output[i] = i1;
                            break;
                        }
                    }
                }
            }
        }

        return output;
    }
}
