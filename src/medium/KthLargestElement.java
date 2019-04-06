package medium;

import java.util.Arrays;
import java.util.Comparator;

public class KthLargestElement {

    public static void main(String[] args) {
        KthLargestElement kthSmallestElement = new KthLargestElement();

        int[] array1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;

        int[] array2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;

        System.out.println(kthSmallestElement.findKthLargest(array1, k1));
        System.out.println(kthSmallestElement.findKthLargest(array2, k2));
    }


    private int findKthLargest(int[] nums, int k) {
        return Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray()[k - 1];
    }
}
