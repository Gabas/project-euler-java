package projecteuler.problems;

/**
 * Problema 6: Diferença de somatório dos quadrados.
 */
public class Problem6 {

    /**
     *
     * @return int
     */
    public int solve() {
        final int REPETITION = 101;
        int sumOfSquares = 0;
        int sumSquare = 0;

        for (int i = 0; i < REPETITION; i++) {
            sumOfSquares += i * i;
        }

        for (int i = 0; i < REPETITION; i++) {
            sumSquare += i;
        }

        sumSquare = sumSquare * sumSquare;

        return sumSquare - sumOfSquares;
    }
}