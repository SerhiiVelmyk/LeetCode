package medium;

import java.util.Arrays;

public class RabbitsInForest {

    public static void main(String[] args) {
        RabbitsInForest rabbitsInForest = new RabbitsInForest();
        int[] array1 = {1, 1, 2};
        int[] array2 = {10, 10, 10};
        int[] array3 = {9, 10, 10};
        int[] array4 = {1, 0, 1, 0, 0};
        int[] array5 = {1, 1, 1, 0, 0};

        System.out.println(rabbitsInForest.numRabbits(array1));
        System.out.println(rabbitsInForest.numRabbits(array2));
        System.out.println(rabbitsInForest.numRabbits(array3));
        System.out.println(rabbitsInForest.numRabbits(array4));
        System.out.println(rabbitsInForest.numRabbits(array5));
    }

    private int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int num = 0;

        for (int i = 0; i < answers.length; i++) {
            int count = getCount(answers, answers[i]);

            double diff = (double) count / (answers[i] + 1);
            num += Math.ceil(diff) * (answers[i] + 1);

            i = i + count - 1;
        }

        return num;
    }

    private int getCount(int[] array, int value) {
        int count = 0;

        for (int i1 : array) {
            if (i1 == value)
                count++;
        }

        return count;
    }
}
