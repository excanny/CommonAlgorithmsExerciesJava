package com.company.ARRAYS;

import java.util.HashMap;

public class FrequencyOfElement {
    public static int  findFrequency(int[] A, int x){
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if(A[i] == x) {

                if (map.containsKey(A[i]))
                    map.put(A[i], map.get(A[i]) + 1);
                else
                    map.put(A[i], 1);
            }
        }

        return map.get(x);
    }
}
