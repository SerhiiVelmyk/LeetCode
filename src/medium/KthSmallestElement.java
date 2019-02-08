package medium;

import java.util.Arrays;

public class KthSmallestElement {


    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;

        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        System.out.println(kthSmallestElement.kthSmallest(matrix, k));
    }


    private int kthSmallest(int[][] matrix, int k) {
        int[] all = new int[matrix.length * matrix.length];
        int index = 0;

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                all[index] = matrix1[j];
                index++;
            }
        }

        Arrays.sort(all);

        return all[k - 1];
    }
}
