package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordCounts = new HashMap<>();
        StringBuilder wordBuilder = new StringBuilder();

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                wordBuilder.append(c);
            } else if (wordBuilder.length() > 0) {
                String word = wordBuilder.toString();
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                wordBuilder.setLength(0);
            }
        }
        if (wordBuilder.length() > 0) {
            String word = wordBuilder.toString();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}