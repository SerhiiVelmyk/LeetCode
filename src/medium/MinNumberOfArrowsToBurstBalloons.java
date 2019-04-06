package medium;

import java.util.Arrays;
import java.util.Comparator;

public class MinNumberOfArrowsToBurstBalloons {

    public static void main(String[] args) {
        int[][] array = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int[][] array2 = {{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}};
        int[][] array3 = {{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}};
        int[][] array4 = {{0, 9}, {1, 8}, {7, 8}, {1, 6}, {9, 16}, {7, 13}, {7, 10}, {6, 11}, {6, 9}, {9, 13}};

        MinNumberOfArrowsToBurstBalloons minNumberOfArrowsToBurstBalloons = new MinNumberOfArrowsToBurstBalloons();
        System.out.println(minNumberOfArrowsToBurstBalloons.findMinArrowShots(array));
        System.out.println(minNumberOfArrowsToBurstBalloons.findMinArrowShots(array2));
        System.out.println(minNumberOfArrowsToBurstBalloons.findMinArrowShots(array3));
        System.out.println(minNumberOfArrowsToBurstBalloons.findMinArrowShots(array4));
    }

    private int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
        int result = 1;
        int shot_pos = points[0][1];
        for (int i = 1; i < points.length; i++) {
            int[] temp = points[i];
            if (shot_pos >= temp[0] && shot_pos <= temp[1]) {
                continue;
            }
            shot_pos = temp[1];
            result++;
        }
        return result;
    }
}
