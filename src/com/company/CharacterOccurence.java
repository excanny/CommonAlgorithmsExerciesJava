package com.company;

public class CharacterOccurence {
    public static String compressedString(String message) {

        int len = message.length();

        char ch[] = new char[message.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = message.charAt(i);
            int found = 0;
            for (int j = 0; j <= i; j++) {

                if (message.charAt(i) == ch[j]){
                    found++;
                }

            }

            if (found == 1)
                return ch.toString();

        }

      return "eefe";
    }

}
