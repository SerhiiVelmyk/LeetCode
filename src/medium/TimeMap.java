package medium;

import java.util.HashMap;
import java.util.Map;

public class TimeMap {

    private Map<String, Map<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Map<Integer, String> inner = new HashMap<>();
        inner.put(timestamp, value);

        map.put(key, inner);
    }

    public String get(String key, int timestamp) {
        return map.get(key).get(timestamp);
    }


}
