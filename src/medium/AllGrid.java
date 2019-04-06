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
                int sumFirst = 0;
                for (int k = 2, value = j; k >= 0 & value > 0; k--) {
                    if (value % 10 <= rowSum - i) {
                        array[0][k] = value % 10;
                        sumFirst += value % 10;
                        value = value / 10;
                    } else {
                        break;
                    }
                }

                if (sumFirst != rowSum)
                    continue;

                array[2][0] = rowSum - array[0][2] - array[1][1];
                array[2][1] = rowSum - array[0][1] - array[1][1];
                array[2][2] = rowSum - array[0][0] - array[1][1];
                array[1][2] = array[1][1] + array[0][0] - array[0][2];
                array[1][0] = array[1][1] + array[0][2] - array[0][0];

                if (array[1][2] <= 9 && array[1][2] >= 0 && array[1][0] <= 9 && array[1][0] >= 0 && array[2][1] <= 9)
                    System.out.println(Arrays.deepToString(array));
            }
        }
    }
}
