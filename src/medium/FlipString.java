package medium;

public class FlipString {

    public static void main(String[] args) {
        FlipString flipString = new FlipString();

        System.out.println(flipString.minFlipsMonoIncr("00110"));
        System.out.println(flipString.minFlipsMonoIncr("010110"));
        System.out.println(flipString.minFlipsMonoIncr("10000011"));
        System.out.println(flipString.minFlipsMonoIncr("11000100001"));
    }

    private int minFlipsMonoIncr(String S) {
        int length = S.length();
        int min = Integer.MAX_VALUE;
        int[] array = new int[length + 1];

        for (int i = 0; i < length; ++i)
            array[i + 1] = array[i] + (S.charAt(i) == '1' ? 1 : 0);
        for (int j = 0; j <= length; ++j)
            min = Math.min(min, array[j] + length - j - (array[length] - array[j]));

        return min;
    }
}
