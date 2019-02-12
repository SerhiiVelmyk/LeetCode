package medium;

public class MaxProductOfWordLengths {

    public static void main(String[] args) {
        String[] array1 = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        String[] array2 = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        String[] array3 = {"a", "aa", "aaa", "aaaa"};

        MaxProductOfWordLengths maxProductOfWordLengths = new MaxProductOfWordLengths();
        System.out.println(maxProductOfWordLengths.maxProduct(array1));
        System.out.println(maxProductOfWordLengths.maxProduct(array2));
        System.out.println(maxProductOfWordLengths.maxProduct(array3));
    }


    private int maxProduct(String[] words) {
        int max2 = 0, max1 = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (noAnyMatch(words[i], words[j]) && max1 * max2 < words[i].length() * words[j].length()) {
                    max1 = words[i].length();
                    max2 = words[j].length();
                }
            }
        }

        return max1 * max2;
    }

    private boolean noAnyMatch(String word1, String word2) {
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        boolean noMatches = true;

        outer:
        for (char c1 : array1) {
            for (char c2 : array2) {
                if (c1 == c2) {
                    noMatches = false;
                    break outer;
                }
            }
        }

        return noMatches;
    }
}
