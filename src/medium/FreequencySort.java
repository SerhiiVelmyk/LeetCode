package medium;

import java.util.*;

public class FreequencySort {

    public static void main(String[] args) {
        FreequencySort fs = new FreequencySort();

        System.out.println(fs.frequencySort("tree"));
        System.out.println(fs.frequencySort("bbaA"));
    }

    private String frequencySort(String s) {
        if (s.length() == 0) {
            return "";
        }
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        char[] array = s.toCharArray();
        treeMap.put(array[0], 1);

        for (int i = 1; i < array.length; i++) {
            char c = array[i];
            if (!treeMap.containsKey(c)) {
                treeMap.put(c, 1);
            } else {
                int count = treeMap.get(c);
                treeMap.put(c, ++count);
            }
        }

        StringBuilder sb = new StringBuilder();
        Object[] treeChar = sortByValue(treeMap).keySet().toArray();

        for (Object o : treeChar) {
            char ch = (char) o;
            for (int j = 0; j < treeMap.get(ch); j++) {
                sb.append(ch);
            }
        }

        return String.valueOf(sb);
    }

    private Map<Character, Integer> sortByValue(Map<Character, Integer> unsortMap) {
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(unsortMap.entrySet());

        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
