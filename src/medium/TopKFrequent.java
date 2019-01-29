package medium;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        int[] array = {3, 1, 3, 2, 3, 2};
        TopKFrequent topKFrequent = new TopKFrequent();

        System.out.println(topKFrequent.topKFrequent(array, 2));
        System.out.println(topKFrequent.topKFrequent(array, 3));
    }

    private List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(nums[0], 1);

        for (int i = 1; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int count = map.get(nums[i]);
                map.put(nums[i], ++count);
            }
        }

        Map<Integer, Integer> newMap = sortByValue(map);
        Set<Integer> set = newMap.keySet();

        for (int i = 0; i < k; i++) {
            list.add((Integer) set.toArray()[i]);
        }

        return list;
    }

    private Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(unsortMap.entrySet());

        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

}
