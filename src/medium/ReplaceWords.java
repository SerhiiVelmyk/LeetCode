package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWords {

    public static void main(String[] args) {
        ReplaceWords replaceWords = new ReplaceWords();
        List<String> dictionary1 = new ArrayList<>(Arrays.asList("cat", "bat", "rat"));
        String sentence1 = "the cattle was rattled by the battery";

        List<String> dictionary2 = new ArrayList<>(Arrays.asList("a", "aa", "aaa", "aaaa"));
        String sentence2 = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";

        System.out.println(replaceWords.replaceWords(dictionary1, sentence1));
        System.out.println(replaceWords.replaceWords(dictionary2, sentence2));
    }

    private String replaceWords(List<String> dict, String sentence) {
        String[] wordsInSentence = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wordsInSentence.length; i++) {
            String word = wordsInSentence[i];
            String root = "";
            boolean isFirst = false;

            for (String dictWord : dict) {
                if (word.startsWith(dictWord)) {
                    if (!isFirst) {
                        isFirst = true;
                        root = dictWord;
                    } else {
                        if (dictWord.length() < root.length()) {
                            root = dictWord;
                        }
                    }
                }
            }

            if (isFirst) {
                wordsInSentence[i] = root;
            }
        }

        for (int i = 0; i < wordsInSentence.length; i++) {
            sb.append(wordsInSentence[i]);
            if (i != wordsInSentence.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
