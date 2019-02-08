package medium;

public class RLEIterator {
    public static void main(String[] args) {
        int[] array = {784, 303, 477, 583, 909, 595};
        RLEIterator rleIterator = new RLEIterator(array);

        System.out.println(rleIterator.next(130));
        System.out.println(rleIterator.next(333));
        System.out.println(rleIterator.next(238));
        System.out.println(rleIterator.next(87));
        System.out.println(rleIterator.next(301));
        System.out.println(rleIterator.next(276));
    }

    private int[] A;
    private int i, q;

    private RLEIterator(int[] A) {
        this.A = A;
        i = q = 0;
    }

    private int next(int n) {
        while (i < A.length) {
            if (q + n > A[i]) {
                n -= A[i] - q;
                q = 0;
                i += 2;
            } else {
                q += n;
                return A[i + 1];
            }
        }

        return -1;
    }
}
