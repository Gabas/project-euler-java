package projecteuler.problems;

/**
 * Problema 3: Maior fator primo de 600851475143.
 */
public class Problem3 {

    /**
     *
     * @return long
     */
    public long solve() {
        long num = 600851475143L;
        long primeFactor = 2;
        while (primeFactor * primeFactor <= num) {
            if (num % primeFactor == 0) {
                num /= primeFactor;
            } else {
                primeFactor++;
            }
        }
        return num;
    }
}