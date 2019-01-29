package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {

    public static void main(String[] args) {
        String[] array = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println(findAndReplacePattern(array, pattern));
    }

    private static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            Map<Character, Character> map = new HashMap<>();
            boolean isMatched = true;

            map.put(pattern.toCharArray()[0], word.toCharArray()[0]);

            for (int j = 1; j < pattern.toCharArray().length; j++) {
                char patternLetter = pattern.toCharArray()[j];
                char wordLetter = word.toCharArray()[j];

                if (!((map.containsKey(patternLetter) && !map.get(patternLetter).equals(wordLetter))
                        | (map.containsValue(wordLetter) && patternLetter != getKeyByValue(map, wordLetter)))) {
                    map.put(patternLetter, wordLetter);
                } else {
                    isMatched = false;
                    break;
                }
            }

            if (isMatched) {
                list.add(word);
            }
        }

        return list;
    }

    private static Character getKeyByValue(Map map, char value) {
        Character returnedValue = null;
        for (Object key : map.keySet()) {
            if (map.get(key).equals(value)) {
                returnedValue = (char) key;
            }
        }

        return returnedValue;
    }

}
