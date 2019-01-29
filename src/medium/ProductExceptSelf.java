package medium;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] array1 = {4, 3, 2, 1};

        System.out.println(Arrays.toString(productExceptSelf.productExceptSelf(array1)));

    }


    private int[] productExceptSelf(int[] nums) {
        if (nums.length == 2) {
            return new int[]{nums[1], nums[0]};
        }
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = i == 0 ? nums[1] : nums[0];
            int j = i == 0 ? 2 : 1;
            for (; j < nums.length; j++) {
                if (i != j) {
                    temp *= nums[j];
                }
            }
            output[i] = temp;
        }

        return output;
    }
}
