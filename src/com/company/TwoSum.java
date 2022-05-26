package com.company;

import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static int[] twoSumArray(int[] numbers, int target) {
        //use hash map to instantly check for difference value,
        // map will add index of last occurrence of a num,
        // don’t use same element twice;

        int[] result = new int[2];
        var hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (hashMap.containsKey(complement)) {
                result[0] =  hashMap.get(complement);
                result[1] = i;
            }
            hashMap.put(numbers[i], i);
        }
        return result;
    }
    public List<Integer> twoSumList(List<Integer> numbers, int target) {


        var getTwoSum = new HashMap<Integer, Integer>();

        return numbers;
    }
}
