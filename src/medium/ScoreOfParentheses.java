package medium;


public class ScoreOfParentheses {

    public static void main(String[] args) {
        ScoreOfParentheses sop = new ScoreOfParentheses();

        System.out.println(sop.scoreOfParentheses("()"));
        System.out.println(sop.scoreOfParentheses("(())"));
        System.out.println(sop.scoreOfParentheses("()()"));
        System.out.println(sop.scoreOfParentheses("(()(()))"));
        System.out.println(sop.scoreOfParentheses("(())(())"));
    }

    private int scoreOfParentheses(String S) {
        int score = 0;
        int count = (S.length() - S.replaceAll("\\(\\)", "").length()) / "()".length();

        for (int i = 0; i < count; i++) {
            int index = S.indexOf("()");
            score = (int) (Math.pow(2, index) + score);
            S = S.replaceFirst("\\(\\)", "");

            while (!S.isEmpty() && S.charAt(index) == ')') {
                StringBuilder sb = new StringBuilder(S);
                sb.deleteCharAt(index);
                sb.deleteCharAt(0);
                S = sb.toString();
                index--;
            }
        }

        return score;
    }
}
