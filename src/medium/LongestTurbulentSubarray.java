package medium;

public class LongestTurbulentSubarray {

    public static void main(String[] args) {
        LongestTurbulentSubarray longestTurbulentSubarray = new LongestTurbulentSubarray();
        int[] array1 = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        int[] array2 = {4, 8, 12, 16};
        int[] array3 = {170, 59, 129, 54, 5, 98, 129, 37, 58, 193};
        int[] array4 = {100, 100, 100};

        System.out.println(longestTurbulentSubarray.maxTurbulenceSize(array1));
        System.out.println(longestTurbulentSubarray.maxTurbulenceSize(array2));
        System.out.println(longestTurbulentSubarray.maxTurbulenceSize(array3));
        System.out.println(longestTurbulentSubarray.maxTurbulenceSize(array4));
    }


    private int maxTurbulenceSize(int[] A) {
        if (A.length == 2 && A[0] != A[1]) {
            return 2;
        } else if (A.length == 2) {
            return 1;
        }
        int maxTurb = 1, temp = 0;

        for (int i = 1; i < A.length - 1; i++) {
            if ((A[i] > A[i - 1] && A[i] < A[i + 1]) || (A[i] < A[i - 1] && A[i] > A[i + 1])
                    || A[i] == A[i - 1] || A[i] == A[i + 1]) {
                maxTurb = maxTurb > 2 ? maxTurb : 2;
                temp = 0;
            } else {
                temp++;
            }

            if (!(A[i] == A[i - 1] && A[i] == A[i + 1])) {
                maxTurb = maxTurb > temp + 2 ? maxTurb : temp + 2;
            } else {
                maxTurb = maxTurb > 2 ? maxTurb : 1;
            }
        }

        return maxTurb;
    }
}
