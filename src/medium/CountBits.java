package medium;

import java.util.Arrays;

public class CountBits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }

    private static int[] countBits(int num) {
        int[] array = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            array[i] = Integer.toBinaryString(i).replace("0", "").length();
        }

        return array;
    }
}
