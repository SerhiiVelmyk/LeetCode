package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    private Map<String, List<List<Object>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<List<Object>> outerList;
        List<Object> innerList = new ArrayList<>();
        innerList.add(value);
        innerList.add(timestamp);

        if (map.get(key) != null) {
            outerList = map.get(key);
        } else {
            outerList = new ArrayList<>();
        }
        outerList.add(innerList);
        map.put(key, outerList);
    }

    public String get(String key, int timestamp) {
        String result = "";
        List<List<Object>> outerList = map.get(key);

        for (List<Object> objects : outerList) {
            int ts = (int) objects.get(1);

            if (ts <= timestamp) {
                result = (String) objects.get(0);
                if (ts == timestamp) {
                    break;
                }
            }
        }

        return result;
    }
}
