package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotationArray {

    //Convert Array to List
    //Use Collections rotate

    public void rotateStringArray(String[] arr, int k){
        Collections.rotate(Arrays.asList(arr), k);
        System.out.println(Arrays.asList(arr));
    }

    public void rotateIntArray(Integer[] arr2, int k){
        Collections.rotate(Arrays.asList(arr2), k);
        System.out.println(Arrays.asList(arr2));
    }

    public void rotateStringList(List<String> arr, int k){
        Collections.rotate(arr, k);
        System.out.println(Arrays.asList(arr));
    }

    public void rotateIntList(List<Integer> arr2, int k){
        Collections.rotate(arr2, k);
        System.out.println(Arrays.asList(arr2));
    }
}
