package medium;

import java.util.LinkedList;
import java.util.List;

public class MinAddToMakeValid {

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
        System.out.println(minAddToMakeValid("((("));
        System.out.println(minAddToMakeValid("()"));
        System.out.println(minAddToMakeValid("()))(()"));
        System.out.println(minAddToMakeValid(""));
    }

    private static int minAddToMakeValid(String S) {
        int count = 0;

        while (S.startsWith(")")) {
            count++;
            S = S.substring(1);
        }

        while (S.endsWith("(")) {
            count++;
            S = S.substring(0, S.length() - 1);
        }

        char[] array = S.toCharArray();
        List<Integer> list = new LinkedList<>();

        for (char c : array) {
            if (c == '(') {
                list.add(1);
            } else {
                list.add(0);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            count++;
            if (list.get(i) == 1) {
                for (int j = i; j < list.size(); j++) {
                    if (list.get(j) == 0) {
                        count--;
                        list.remove(j);
                        break;
                    }
                }
            }
        }

        return count;
    }
}
