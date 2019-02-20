package medium;

import java.util.Arrays;

public class MinimumPathSum {

    public static void main(String[] args) {
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int[][] array = {
                {1, 3, 1, 3},
                {1, 5, 1, 5},
                {4, 2, 5, 1},
                {1, 1, 5, 1}};
        int[][] array2 = {{1, 2}, {1, 1}};
        int[][] array3 = {
                {1, 4, 8, 6, 2, 2, 1, 7},
                {4, 7, 3, 1, 4, 5, 5, 1},
                {8, 8, 2, 1, 1, 8, 0, 1},
                {8, 9, 2, 9, 8, 0, 8, 9},
                {5, 7, 5, 7, 1, 8, 5, 5},
                {7, 0, 9, 4, 5, 6, 5, 6},
                {4, 9, 9, 7, 9, 1, 9, 0}};
        int[][] array4 = {
                {3, 8, 6, 0, 5, 9, 9, 6, 3, 4, 0, 5, 7, 3, 9, 3},
                {0, 9, 2, 5, 5, 4, 9, 1, 4, 6, 9, 5, 6, 7, 3, 2},
                {8, 2, 2, 3, 3, 3, 1, 6, 9, 1, 1, 6, 6, 2, 1, 9},
                {1, 3, 6, 9, 9, 5, 0, 3, 4, 9, 1, 0, 9, 6, 2, 7},
                {8, 6, 2, 2, 1, 3, 0, 0, 7, 2, 7, 5, 4, 8, 4, 8},
                {4, 1, 9, 5, 8, 9, 9, 2, 0, 2, 5, 1, 8, 7, 0, 9},
                {6, 2, 1, 7, 8, 1, 8, 5, 5, 7, 0, 2, 5, 7, 2, 1},
                {8, 1, 7, 6, 2, 8, 1, 2, 2, 6, 4, 0, 5, 4, 1, 3},
                {9, 2, 1, 7, 6, 1, 4, 3, 8, 6, 5, 5, 3, 9, 7, 3},
                {0, 6, 0, 2, 4, 3, 7, 6, 1, 3, 8, 6, 9, 0, 0, 8},
                {4, 3, 7, 2, 4, 3, 6, 4, 0, 3, 9, 5, 3, 6, 9, 3},
                {2, 1, 8, 8, 4, 5, 6, 5, 8, 7, 3, 7, 7, 5, 8, 3},
                {0, 7, 6, 6, 1, 2, 0, 3, 5, 0, 8, 0, 8, 7, 4, 3},
                {0, 4, 3, 4, 9, 0, 1, 9, 7, 7, 8, 6, 4, 6, 9, 5},
                {6, 5, 1, 9, 9, 2, 2, 7, 4, 2, 7, 2, 2, 3, 7, 2},
                {7, 1, 9, 6, 1, 2, 7, 0, 9, 6, 6, 4, 4, 5, 1, 0},
                {3, 4, 9, 2, 8, 3, 1, 2, 6, 9, 7, 0, 2, 4, 2, 0},
                {5, 1, 8, 8, 4, 6, 8, 5, 2, 4, 1, 6, 2, 2, 9, 7}};


        System.out.println(minimumPathSum.minPathSum2(array));
        System.out.println(minimumPathSum.minPathSum2(array2));
        System.out.println(minimumPathSum.minPathSum2(array3));
        System.out.println(minimumPathSum.minPathSum2(array4));
    }

    private int minPathSum2(int[][] grid) {
        for (int i = 1; i < grid.length; i++)
            grid[i][0] += grid[i - 1][0];
        for (int j = 1; j < grid[0].length; j++)
            grid[0][j] += grid[0][j - 1];

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j]) + grid[i][j];
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }

    private int minPathSum(int[][] grid) {
        int min = Integer.MAX_VALUE, m = grid.length, n = grid[0].length, moves = (m - 1) + (n - 1);
        int[] arrayFull = new int[m], arrayTo = new int[m];
        Arrays.fill(arrayFull, n - 1);
        Arrays.fill(arrayTo, n - 1);
        arrayTo[0] = -1;
        arrayTo[m - 1] = n - 1;
        int comb = 0;

        if (m == 1 || n == 1) {
            int miniTemp = 0;
            for (int[] ints : grid) {
                for (int j = 0; j < n; j++) {
                    miniTemp += ints[j];
                }
            }

            return miniTemp;
        }

        while (!Arrays.equals(arrayFull, arrayTo)) {
            int tempSum = 0, tempMoves = moves, tempI = 0, tempJ = 0;

            while (tempMoves-- >= 0) {
                tempSum += grid[tempI][tempJ];

                if (tempSum > min) {
                    break;
                }

                if (tempJ < arrayFull[tempI]) {
                    tempJ++;
                } else {
                    tempI++;
                }
            }

            boolean decremented = false;
            for (int i = arrayFull.length - 2; i > 0; i--) {
                if (arrayFull[i] != arrayFull[i - 1]) {
                    arrayFull[i]--;

                    if (arrayFull[i] + 1 == arrayFull[i + 1]) {
                        for (int j = i + 1; j < m - 1; j++) {
                            arrayFull[j] = n - 1;
                        }
                    }

                    decremented = true;
                    break;
                }
            }

            if (!decremented) {
                arrayFull[0]--;
                if (arrayFull[0] != arrayFull[m - 1]) {
                    for (int i = 1; i < m - 1; i++) {
                        arrayFull[i] = n - 1;
                    }
                }
            }

            comb++;

            min = Math.min(min, tempSum);
        }

        System.out.println(comb + " ");

        return min;
    }
}
