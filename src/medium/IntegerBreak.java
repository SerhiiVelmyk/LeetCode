package medium;

public class IntegerBreak {

    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();

        System.out.println(integerBreak.integerBreak(9));
        System.out.println(integerBreak.integerBreak(10));
        System.out.println(integerBreak.integerBreak(11));
        System.out.println(integerBreak.integerBreak(12));
        System.out.println(integerBreak.integerBreak(58));
    }

    private int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        }

        int value = n % 3 == 1 ? 4 : 3;
        int latest = n % 3 == 2 ? 2 : 1;
        n -= value;

        while (n >= 3) {
            value *= 3;
            n -= 3;
        }

        return value * latest;
    }
}
