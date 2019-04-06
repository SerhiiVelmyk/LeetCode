package medium;

import java.util.*;
import java.util.stream.Collectors;

public class MinimumTimeDifference {

    public static void main(String[] args) {
        List<String> times = Arrays.asList("23:59", "00:00");

        MinimumTimeDifference minimumTimeDifference = new MinimumTimeDifference();
        System.out.println(minimumTimeDifference.findMinDifference(times));
    }


    private int findMinDifference(List<String> timePoints) {
        int diff = 1440;
        if (timePoints.size() != timePoints.stream().distinct().collect(Collectors.toList()).size()) {
            return 0;
        }

        for (int i = 0; i < timePoints.size() - 1; i++) {
            for (int j = i + 1; j < timePoints.size(); j++) {
                int tempDiff = getDifference(timePoints.get(i), timePoints.get(j));
                diff = diff < tempDiff ? diff : tempDiff;
            }
        }

        return diff;
    }

    private int getDifference(String first, String second) {
        int[] firstArray = {Integer.parseInt(first.split(":")[0]), Integer.parseInt(first.split(":")[1])};
        int[] secondArray = {Integer.parseInt(second.split(":")[0]), Integer.parseInt(second.split(":")[1])};

        int max = Math.max(firstArray[0] * 60 + firstArray[1], secondArray[0] * 60 + secondArray[1]);
        int min = Math.min(firstArray[0] * 60 + firstArray[1], secondArray[0] * 60 + secondArray[1]);

        return Math.min(max - min, min - max + 1440);
    }


}
