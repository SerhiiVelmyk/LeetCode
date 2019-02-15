package medium;

import java.util.ArrayList;
import java.util.List;

public class TwoKeysKeyboard {
    private int minSteps;

    public static void main(String[] args) {
        TwoKeysKeyboard twoKeysKeyboard = new TwoKeysKeyboard();

        System.out.println(twoKeysKeyboard.minSteps(6));
        System.out.println(twoKeysKeyboard.minSteps(9));
        System.out.println(twoKeysKeyboard.minSteps(14));
        System.out.println(twoKeysKeyboard.minSteps(18));
        System.out.println(twoKeysKeyboard.minSteps(15));
        System.out.println(twoKeysKeyboard.minSteps(64));
        System.out.println(twoKeysKeyboard.minSteps(512));
        System.out.println(twoKeysKeyboard.minSteps(999));
    }

    private int minSteps(int n) {
        minSteps = 0;
        if (n == 1) {
            return minSteps;
        }
        return helper(n);
    }

    private int helper(int n) {
        if (n < 6) {
            minSteps = n + minSteps;
            return minSteps;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            minSteps += n;
        } else {
            minSteps += list.get(0);
            helper(n / list.get(0));
        }

        return minSteps;
    }
}
