package com.company.STRINGS;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

    public static HashMap<Character, Integer> duplicateCharacters(String word) {
        char[] characters = word.toCharArray();
        var charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        return charMap;
    }
}
