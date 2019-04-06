package medium;

public class IsSubSequence {

    public static void main(String[] args) {
        IsSubSequence isSubSequence = new IsSubSequence();

        System.out.println(isSubSequence.isSubSequence("abc", "ahbgdc"));
        System.out.println(isSubSequence.isSubSequence("axc", "aaaaaxxxx"));
    }

    private boolean isSubSequence(String s, String t) {
        char[] sArray = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            int index = t.indexOf(sArray[i]);

            if (index == -1) {
                return false;
            }

            t = t.substring(index + 1);
        }

        return true;
    }
}
