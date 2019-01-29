package medium;

public class SingleNonDuplicate {


    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 3};
        int[] array2 = {1, 1, 2};
        System.out.println(singleNonDuplicate(array1));
        System.out.println(singleNonDuplicate(array2));
    }


    private static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int value = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i = i + 2) {
            if (nums[i] != value && nums[i] != nums[i + 1]) {
                value = nums[i];
                break;
            }
        }

        return value;
    }
}
