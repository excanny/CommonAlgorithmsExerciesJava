package com.company.ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMinKthLargestSmallestElement {

    public static int peakElement(int[] arr){

        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    public static int minElement(int[] arr){

        Arrays.sort(arr);

        return arr[0];
    }

    public static int KthLargestElement(int[] arr, int k){


        var objArray = new Integer [arr.length];
        for (int i = 0; i <  arr.length; i++) {
            objArray[i] = arr[i];
        }

        Arrays.sort(objArray, Collections.reverseOrder());

        return arr[k - 1 ];
    }


}
