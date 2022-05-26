package com.company.STRINGS;

import java.util.Arrays;

public class Anagram {

    public static boolean testAnagram(String a, String b){
        char [] aChar = a.toCharArray();

        char [] bChar = b.toCharArray();

        Arrays.sort(aChar);

        Arrays.sort(bChar);

        if(Arrays.equals(aChar, bChar))
            return true;
        else
            return false;
    }
}
