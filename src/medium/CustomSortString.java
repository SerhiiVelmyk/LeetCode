package medium;

public class CustomSortString {

    public static void main(String[] args) {
        System.out.println(customSortString("cba", "abcd"));
        System.out.println(customSortString("kqep", "pekeq"));
    }

    private static String customSortString(String S, String T) {
        char[] sArray = S.toCharArray();
        char[] tArray = T.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : sArray) {
            int countOfLetter = count(T, c);
            for (int j = 0; j < countOfLetter; j++) {
                sb.append(c);
            }
        }

        String temp = sb.toString();

        for (char c : tArray) {
            if (!temp.contains(String.valueOf(c))) {
                sb.append(c);
            }
        }

        return String.valueOf(sb);
    }

    private static int count(String S, char symbol) {
        return (S.split(String.valueOf(symbol), -1).length) - 1;
    }
}
