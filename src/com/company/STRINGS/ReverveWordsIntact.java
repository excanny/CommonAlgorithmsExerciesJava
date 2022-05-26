package com.company.STRINGS;

public class ReverveWordsIntact {

    public static String reverseWordsIntact(String str){
        String [] words = str.split("\\.");
        String reversedWords = "";

        for (int i = 0; i < words.length; i++)
            reversedWords = " " + words[i] + reversedWords;
        return reversedWords;
    }
}
