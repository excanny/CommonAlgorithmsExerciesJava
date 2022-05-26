package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    // Find if strings 'X' and 'Y' are Isomorphic or not
    public static boolean isIsomorphic(String x, String y) {

        // Use two hashmaps to store string characters

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < x.length(); i++) {
            char c1 = x.charAt(i);
            char c2 = y.charAt(i);

            if (map1.containsKey(c1)) {
                if (c2 != map1.get(c1))
                    return false;
            } else {
                if (map2.containsKey(c2))
                    return false;
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
        }

        return true;
    }
}
