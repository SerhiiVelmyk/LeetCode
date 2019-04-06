package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BrickWall {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1, 2, 2, 1));
        list.add(Arrays.asList(3, 1, 2));
        list.add(Arrays.asList(1, 3, 2));
        list.add(Arrays.asList(2, 4));
        list.add(Arrays.asList(3, 1, 2));
        list.add(Arrays.asList(1, 3, 1, 1));

        BrickWall brickWall = new BrickWall();
        System.out.println(brickWall.leastBricks(list));
    }

    private int leastBricks(List<List<Integer>> wall) {
        int[] a = new int[65536];
        for (List<Integer> b : wall) {
            int sum = 0;
            for (int i = 0; i < b.size() - 1; i++) {
                sum += b.get(i);
                a[sum]++;
            }
        }
        int max = 0;
        for (int i : a)
            if (max < i)
                max = i;
        return wall.size() - max;
    }

    private int leastBricks2(List<List<Integer>> wall) {
        long width = 0;
        int leastBrick = wall.size(), size = wall.size();

        for (int brick : wall.get(0))
            width += brick;

        for (int i = 1; i < width; i++) {
            int tempLeastBrick = 0;

            for (List<Integer> list : wall) {
                if (list.size() != 1) {
                    int sum = 0;
                    for (int j = 0; j < list.size() - 1 && sum + list.get(j) <= i; j++) {
                        sum += list.get(j);
                    }

                    if (sum == i) {
                        tempLeastBrick++;
                    }
                }
            }

            if (leastBrick > size - tempLeastBrick) {
                leastBrick = size - tempLeastBrick;
            }
        }

        return leastBrick;
    }
}
