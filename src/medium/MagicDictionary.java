package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicDictionary {

    private List<String> dictionary;

    public static void main(String[] args) {
        MagicDictionary obj = new MagicDictionary();
        String[] dict = {"hello", "leetcode", "hallo"};

        obj.buildDict(dict);
        System.out.println(obj.search("hello"));
        System.out.println(obj.search("hhllo"));
        System.out.println(obj.search("hell"));
        System.out.println(obj.search("leetcoded"));
    }

    private MagicDictionary() {
        dictionary = new ArrayList<>();
    }

    private void buildDict(String[] dict) {
        dictionary.addAll(Arrays.asList(dict));
    }

    private boolean search(String word) {
        boolean found = false;

        char[] wordArray = word.toCharArray();

        for (String s : dictionary) {
            char[] dictArray = s.toCharArray();

            if (dictArray.length == wordArray.length) {
                int notEqualsChars = 0;
                for (int j = 0; j < wordArray.length; j++) {
                    if (dictArray[j] != wordArray[j]) {
                        notEqualsChars++;
                    }
                }

                if (notEqualsChars == 1) {
                    found = true;
                    break;
                }
            }
        }

        return found;
    }
}
