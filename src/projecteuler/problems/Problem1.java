package projecteuler.problems;

/**
 * Problema 1: Somatório dos múltiplos de 3 e 5 menores que 1000.
 */
public class Problem1 {

    /**
     *
     * @return int
     */
    public int solve() {
        int summation = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                summation += i;
            }
        }
        return summation;
    }
}