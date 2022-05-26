package com.company;

public class MaxMinSubArraySumKadaneAlgo {
    // use Kadane's algorithm
    public static int maximumSubarraySum(int[] nums) {

        int result = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
        }

        return result;
    }

    public int minimumSubarraySumToTarget(int[] arr, int target) {
        int n = arr.length;
        int min_length = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];

            if (currSum > target) {
               // maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return 2;
    }
}
