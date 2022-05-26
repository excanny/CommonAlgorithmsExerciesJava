package com.company;

public class MinSumEqualToTarget {

    public int SmallestCoins(int coins[], int V){

        var n = coins.length;

        int min_length = n + 1;

        var sum = 0;

        for (int i = 0; i < n; i++) {
            sum += coins[i];
            for (int j = 1; j < n; j++) {
                sum += coins[j];
                if(sum == V)
                {
                    if((j - i + 1) < min_length)
                        min_length = (j - i + 1);
                }
                else return -1;

            }
        }

        return min_length;
    }
}
