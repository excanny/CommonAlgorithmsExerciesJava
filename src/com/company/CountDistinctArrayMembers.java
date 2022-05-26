package com.company;

public class CountDistinctArrayMembers {
    public static int getDistinctCount() {
           int[] arr = {4, 6, 2, 2, 6, 6, 1};
            var N = arr.length;
            var result = 0;
             int i, j;
            for (i = 0; i < N; i++)
                for (j = 0; j < N; j++)
                    if (arr[i] == arr[j])
                        result = Math.max(result, Math.abs(i - j));
            return result;
        }
}

