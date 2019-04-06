package medium;

public class LengthOfLongestFibonacciSubSequence {

    public static void main(String[] args) {
        LengthOfLongestFibonacciSubSequence fib = new LengthOfLongestFibonacciSubSequence();
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 3, 7, 11, 12, 14, 18};

        System.out.println(fib.lenLongestFibSubseq(array1));
        System.out.println(fib.lenLongestFibSubseq(array2));
    }


    private int lenLongestFibSubseq(int[] A) {
        int longFib = 0;

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int subSeq = 2, temp1 = A[i], temp2 = A[j], k = j + 1;
                while (k < A.length) {
                    if (A[k] == temp1 + temp2) {
                        temp1 = temp2;
                        temp2 = A[k];
                        subSeq++;
                    }
                    k++;
                }

                if (subSeq > longFib && subSeq > 2) {
                    longFib = subSeq;
                }

            }
        }

        return longFib;
    }
}
