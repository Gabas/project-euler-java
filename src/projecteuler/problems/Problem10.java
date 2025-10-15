package projecteuler.problems;

import projecteuler.functions.PrimeFunctions;

/**
 * Problema 10: Somatório dos primos menores que 2000000.
 */
public class Problem10 {

    /**
     *
     * @return long
     */
    public long solve() {
        long summation = 0;
        for (int num = 0; num < 2000000; num++) {
            if (PrimeFunctions.isPrime(num)) {
                summation += num;
            }
        }
        return summation;
    }
}