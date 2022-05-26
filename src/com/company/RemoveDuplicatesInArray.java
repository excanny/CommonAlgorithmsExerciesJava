package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArray {
// Add array or list to hashset
    public void removeDuplicates(int [] arr){

        Set<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }

        System.out.println(set);

    }

    public void removeDuplicatesList(List<Integer> arr){

        Set<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.size(); i++) {

            set.add(arr.get(i));
        }

        System.out.println(set);

    }
}
