package medium;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2};

        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();
        System.out.println(findDuplicateNumber.findDuplicate(array));
    }


    private int findDuplicate(int[] nums) {
        int duplicatedNumber = 0;
        int[] array = new int[nums.length];

        for (int num : nums) {
            ++array[num];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                duplicatedNumber = i;
                break;
            }
        }

        return duplicatedNumber;
    }
}
