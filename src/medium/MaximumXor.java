package medium;

public class MaximumXor {

    public static void main(String[] args) {
        MaximumXor maximumXor = new MaximumXor();

        int[] array = {3, 10, 5, 25, 2, 8};

        System.out.println(maximumXor.findMaximumXOR(array));
    }

    private int findMaximumXOR(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j && (nums[i] ^ nums[j]) > max) {
                    max = nums[i] ^ nums[j];
                }
            }
        }

        return max;
    }
}
