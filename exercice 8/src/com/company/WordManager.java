package com.company;

import java.util.*;

public class WordManager {
    private String word;
    private char[] chars;
    private String[] toCount = {"a", "e", "i", "o", "u", "y"};
    private Map<String, Integer>counted = new HashMap<>();

    public WordManager (String word) {
        this.word = word;
        this.chars = word.toCharArray();
        for (String character : toCount) {
            this.counted.put(character, 0);
        }
    }

    public void charCounter () {
        for (int i = 0; i < chars.length; i++) {
            String characterToCheck = String.valueOf(this.chars[i]);
            for (int j = 0; j < toCount.length; j++) {
                String charToCount = toCount[j];
                if (charToCount.equals(characterToCheck)) {
                    Integer nb = new Integer(counted.get(charToCount));
                    nb++;
                    counted.put(charToCount, nb);
                }
            }
        }
        countedDisplay();
    }

    private void countedDisplay () {
        List<String>keys = new ArrayList<>(counted.keySet());
        Collections.sort(keys);
        for (String key : keys) {
            int value = counted.get(key);
            System.out.println("la lettre " + key + " est présente " + value + " fois");
        }
    }
}
