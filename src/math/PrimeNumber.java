package math;

import java.math.BigInteger;
public class PrimeNumber {
	public static void main(String[] args) {

	}

	long[] primes = new long[1000000];
	primes[0] = 2;


	int primeCount = 1;
	long candidate = 3;
        while (primeCount < 1000000);
        {
		boolean isPrime = true;
		for (long prime : primes) {
			if (prime == 0) { break; }
			if (candidate % prime == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			primes[primeCount++] = candidate;
			System.out.println(primeCount + "\t: " + candidate);
		}
		candidate += 2;
	}

}
	/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

