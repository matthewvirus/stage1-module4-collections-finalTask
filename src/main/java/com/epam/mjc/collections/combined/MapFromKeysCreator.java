package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> stringAndItsLengthMap = new HashMap<>();
        for (Map.Entry<String, Integer> sourceMapEntry: sourceMap.entrySet()) {
            Set<String> keysSet = stringAndItsLengthMap.getOrDefault(sourceMapEntry.getKey().length(), new HashSet<>());
            keysSet.add(sourceMapEntry.getKey());
            stringAndItsLengthMap.put(sourceMapEntry.getKey().length(), keysSet);
        }
        return stringAndItsLengthMap;
    }
}
