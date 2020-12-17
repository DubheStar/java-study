package cn.j0hn.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("a", "AAA");
        map.put("b", "BBB");
        map.put("c", "CCC");
        map.put("d", "DDD");

        Set<String> mapKeySet = map.keySet();

        for (String key : mapKeySet) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        Set<Map.Entry<String, String>> mapEntrySet = map.entrySet();
        for (Map.Entry<String, String> entry : mapEntrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Collection<String> mapValues = map.values();
        for (String value : mapValues) {
            System.out.println("value: "+value);
        }
    }
}
