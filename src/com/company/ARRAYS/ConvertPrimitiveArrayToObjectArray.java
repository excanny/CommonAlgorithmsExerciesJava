package com.company.ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class ConvertPrimitiveArrayToObjectArray {

    public static Integer[] convert(int[] arr){
        // Convert primitive array to object array in order to reverse it
        var objArray = new Integer [arr.length];
        for (int i = 0; i <  arr.length; i++) {
            objArray[i] = arr[i];
        }

        return objArray;

    }
}
