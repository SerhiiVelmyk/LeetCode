package medium;

import java.util.Arrays;

public class MaxChunks {

    public static void main(String[] args) {
        MaxChunks maxChunks = new MaxChunks();
        int[] array1 = {1, 0, 3, 2, 5, 4};
        int[] array2 = {1, 3, 4, 0, 2};
        int[] array3 = {0, 1, 2, 3, 4};
        int[] array4 = {4, 3, 2, 1, 0};
        int[] array5 = {1, 0, 2, 3, 4};
        int[] array6 = {2, 0, 1, 3};
        System.out.println(maxChunks.maxChunksToSorted(array1));
        System.out.println(maxChunks.maxChunksToSorted(array2));
        System.out.println(maxChunks.maxChunksToSorted(array3));
        System.out.println(maxChunks.maxChunksToSorted(array4));
        System.out.println(maxChunks.maxChunksToSorted(array5));
        System.out.println(maxChunks.maxChunksToSorted2(array6));
    }


    private int maxChunksToSorted(int[] arr) {
        int maxChunk = arr.length;

        for (int i = 0, count = 0; i < arr.length; i++) {
            int digit = count;
            boolean isCountFound = false;
            int[] leftArray = Arrays.copyOfRange(arr, 0, i);
            int[] rightArray = Arrays.copyOfRange(arr, i, arr.length);

            if (rightArray.length != 1) {
                for (int j = 0; j < rightArray.length; j++) {
                    if (digit == rightArray[j] && maxChunk >= maxChunk - j) {
                        maxChunk = maxChunk - j;
                        i = positionInArray(arr, rightArray[j]);
                        isCountFound = true;

                        if (!isNumberLessThenInArray(leftArray, rightArray[j])) {
                            maxChunk--;
                        }

                        break;
                    }
                }
                if (!isCountFound) {
                    i--;
                }
                count++;
            } else {
                Arrays.sort(arr);
                if (arr[arr.length - 1] != rightArray[0]) {
                    maxChunk--;
                }
            }
        }

        return maxChunk;
    }

    private boolean isNumberLessThenInArray(int[] array, int number) {
        boolean bigger = true;

        for (int i1 : array) {
            if (i1 > number) {
                bigger = false;
                break;
            }
        }
        return bigger;
    }

    private int positionInArray(int[] array, int number) {
        int position = 0;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                position = i;
            }
        }
        return position;
    }

    private int maxChunksToSorted2(int[] arr) {
        int sum = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - i;
            if (sum == 0)
                res++;
        }
        return res;
    }

}
