package com.company.ARRAYS;

public class MiddleValueOfArray {

    public static int[] getMidValues(int[] a){

        int[] arr = new int[2];

        if(a.length % 2 == 0){
            arr[0] = a[a.length / 2];
            arr[1] = a[(a.length / 2) - 1];
        }
        else
            arr[0] = a[a.length/ 2];

        return arr;
    }
}
