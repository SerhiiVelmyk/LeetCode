package medium;

public class UniquePath {


    public static void main(String[] args) {
        UniquePath uniquePath = new UniquePath();
        System.out.println(uniquePath.uniquePaths(7, 6));
        System.out.println(uniquePath.uniquePaths(5, 7));
    }


    private int uniquePaths(int m, int n) {
        if (Math.min(m, n) == 1) {
            return 1;
        }

        if (Math.min(m, n) == 2) {
            return Math.max(m, n);
        }

        int max = Math.max(m, n);
        int min = Math.min(m, n);

        int[] array = new int[max];

        for (int i = 0; i < max; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < min - 2; i++) {
            for (int j = 0; j < max; j++) {
                if (j != 0) {
                    array[j] += array[j - 1];
                }
            }
        }

        return array[max - 1];
    }

}
