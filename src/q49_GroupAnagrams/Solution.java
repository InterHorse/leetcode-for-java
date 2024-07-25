package q49_GroupAnagrams;

import java.util.*;

/**
 * @author by yozee
 * @description
 * @date 2024/7/25
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        Arrays.stream(strs).forEach(str -> {
            String key = sortString(str);
            put(map, key, str);
        });

        return new ArrayList<>(map.values());
    }

    private String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private void put(Map<String, List<String>> map, String key, String str) {
        if (!map.containsKey(key)) {
            List<String> list = new ArrayList<>();
            list.add(str);
            map.put(key, list);
        } else {
            map.get(key).add(str);
        }
    }
}
