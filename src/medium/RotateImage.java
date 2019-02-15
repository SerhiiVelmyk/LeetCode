package medium;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(array);
        rotateImage.rotate(array2);
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(array2));
    }

    private void rotate(int[][] matrix) {
        int step = 0;
        int length = matrix.length;
        int[] all = new int[length * length];

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                all[step++] = matrix[j][i];
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= 0; j--) {
                matrix[i][j] = all[--step];
            }
        }
    }
}
