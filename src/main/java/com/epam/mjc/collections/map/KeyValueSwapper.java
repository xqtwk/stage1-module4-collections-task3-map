package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }
}
