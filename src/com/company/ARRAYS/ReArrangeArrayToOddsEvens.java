package com.company.ARRAYS;

public class ReArrangeArrayToOddsEvens {
        public static int[] reArrange(int[] a){
            int even = 0;
            int odd = 1;

            int[] arranged = new int[a.length];

            for (int i = 0; i < a.length ; i++) {
                if(a[i] % 2 == 0){
                    arranged[even] = a[i];
                    even+=2;
                }
                else{
                    arranged[odd] = a[i];
                    odd+=2;
                }
            }

            return arranged;
        }
}
