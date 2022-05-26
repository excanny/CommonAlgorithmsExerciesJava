package com.company;

import java.util.HashSet;

public class ContainsDuplicate {
    //hashset to get unique values in array, to check for duplicates easily
    public static boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums)
            if(!set.add(i))
                return true;
        return false;
    }
}
