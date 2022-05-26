package com.company;

public class ReverseString {

    //Use stringBuilder's reverse method

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        return sb.reverse().toString();
    }
}
