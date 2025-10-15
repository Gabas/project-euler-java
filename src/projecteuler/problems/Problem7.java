package projecteuler.problems;

import projecteuler.functions.PrimeFunctions;

/**
 * Problema 7: O 10001º número primo.
 */
public class Problem7 {

    /**
     *
     * @return int
     */
    public int solve() {
        int num = 2;
        int primeQuantity = 0;
        while (primeQuantity < 10001) {
            if (PrimeFunctions.isPrime(num)) {
                primeQuantity++;
            }
            if (primeQuantity == 10001) {
                break;
            }
            num++;
        }
        return num;
    }
}