package medium;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthPairChain {

    public static void main(String[] args) {
        int[][] array = {{1, 2}, {2, 3}, {3, 4}};
        int[][] array2 = {{-10, -8}, {8, 9}, {-5, 0}, {6, 10}, {-6, -4}, {1, 7}, {9, 10}, {-4, 7}};
        int[][] array3 = {{7, 9}, {4, 5}, {7, 9}, {-7, -1}, {0, 10}, {3, 10}, {3, 6}, {2, 3}};

        MaxLengthPairChain maxLengthPairChain = new MaxLengthPairChain();
        System.out.println(maxLengthPairChain.findLongestChain(array));
        System.out.println(maxLengthPairChain.findLongestChain(array2));
        System.out.println(maxLengthPairChain.findLongestChain(array3));
    }

    private int findLongestChain(int[][] pairs) {
        if (pairs.length < 2)
            return 0;
        Arrays.sort(pairs, Comparator.comparingInt((int[] arr) -> arr[1]));

        int[] chainFrom = pairs[0];
        int max = 1;

        for (int j = 1; j < pairs.length; j++) {
            if (pairs[j][0] > chainFrom[1]) {
                max++;
                chainFrom = pairs[j];
            }
        }

        return max;
    }
}
