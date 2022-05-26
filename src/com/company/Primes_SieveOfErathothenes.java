package com.company;

public class Primes_SieveOfErathothenes {

    static void sieveOfEratosthenes(int n) {
        // Create a boolean array. Set all values are true

        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

       // System.out.print(prime);

        //Loop tru the multiples of prime array and cancel out as prime
        for (int j = 2; j * j <= n; j++)
        {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[j] == true)
            {
                // Update all multiples of j
                for (int i = j * j; i <= n; i += j)
                    prime[i] = false;
            }
        }

    }
}
