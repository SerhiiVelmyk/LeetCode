package medium;

public class ArrayNesting {

    public static void main(String[] args) {
        ArrayNesting arrayNesting = new ArrayNesting();

        int[] array = {5, 4, 0, 3, 1, 6, 2};

        System.out.println(arrayNesting.arrayNesting(array));
    }

    private int arrayNesting(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int tempCount = 0;
            int value = num;
            int j = nums.length - 1;

            do {
                value = nums[value];
                tempCount++;
                j--;
            } while (value != num && j >= 0);

            if (tempCount > count) {
                count = tempCount;
            }
        }

        return count;
    }
}
