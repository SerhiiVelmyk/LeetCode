package medium;

import java.util.Arrays;

public class DailyTemperature {

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
//        int[] temperatures2 = {55, 38, 53, 81, 61, 93, 97, 32, 43, 78};

        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
//        System.out.println(Arrays.toString(dailyTemperatures(temperatures2)));
    }


    private static int[] dailyTemperatures(int[] T) {
        int[] values = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            int days = 0;
            int aa = 0;
            for (int j = i + 1; j < T.length; j++) {
                days++;
                if (T[j] > T[i]) {
                    break;
                } else {
                    aa++;
                }
            }

            if (days == aa) {
                values[i] = 0;
            } else {
                values[i] = days;
            }
        }

        return values;
    }
}
