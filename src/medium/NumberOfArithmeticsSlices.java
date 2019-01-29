package medium;

import java.util.stream.IntStream;

public class NumberOfArithmeticsSlices {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(numberOfArithmeticSlices(array));
    }

    private static int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        int numberOfSlices = 0;
        int diff = A[1] - A[0];
        int diffCount = 0;

        for (int i = 1; i < A.length; i++) {
            if (diff == A[i] - A[i - 1]) {
                diffCount++;
            } else {
                numberOfSlices = numberOfSlices + getNumberOfSlices(diffCount);
                diff = A[i] - A[i - 1];
                diffCount = 1;
            }

            if (i == A.length - 1 && diffCount > 0) {
                numberOfSlices = numberOfSlices + getNumberOfSlices(diffCount);
            }

        }

        return numberOfSlices;
    }


    private static int getNumberOfSlices(int diffCount) {
        if (diffCount < 2) {
            return 0;
        }

        return IntStream.range(0, diffCount).sum();
    }

}
