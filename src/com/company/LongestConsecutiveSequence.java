package com.company;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] arr) {

        var n = arr.length;
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        // Hash all the array elements
        for (int i = 0; i < n; ++i)
            set.add(arr[i]);

        // check each possible sequence from the start
        // then update optimal length
        for (int i = 0; i < n; ++i)
        {
            // if current element is the starting
            // element of a sequence
            if (!set.contains(arr[i] - 1))
            {
                // Then check for next elements
                // in the sequence
                int j = arr[i];
                while (set.contains(j))
                    j++;

                // update  optimal length if this
                // length is more
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;


    }

}