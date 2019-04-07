package medium;

import java.util.Arrays;

public class AllGrid {

    public static void main(String[] args) {
        AllGrid allGrid = new AllGrid();
        allGrid.printAllCombinationsOfGrid();
    }

    private void printAllCombinationsOfGrid() {
        for (int i = 0; i <= 9; i++) {
            int[][] array = new int[3][3];
            int rowSum = i * 3;
            array[1][1] = i;

            for (int j = 7 * rowSum; j <= 67 * rowSum; j += 9) {
                for (int k = 2, value = j, m = 0; k >= 0; k--, m++, value /= 10) {
                    array[0][k] = value % 10;
                    array[2][m] = rowSum - array[1][1] - array[0][k];
                }
                array[1][2] = array[1][1] + array[0][0] - array[0][2];
                array[1][0] = array[1][1] + array[0][2] - array[0][0];

                if (array[2][0] + array[2][1] + array[2][2] == rowSum && array[1][2] >= 0 && array[1][0] >= 0
                        && array[2][1] >= 0 && array[1][2] <= 9 && array[1][0] <= 9 && array[2][1] <= 9)
                    System.out.println(Arrays.deepToString(array));
            }
        }
    }
}
