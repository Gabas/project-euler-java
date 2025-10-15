package projecteuler.problems;

/**
 * Problema 2: Somatório dos números de Fibonacci pares menores que 4000000.
 */
public class Problem2 {

    /**
     *
     * @return int
     */
    public int solve() {
        int fibonacciPredecessor = 1;
        int fibonacciPredecessor2 = 1;
        int fibonacci = fibonacciPredecessor;
        int summation = 0;

        while (fibonacci < 4000000) {
            if (fibonacci % 2 == 0) {
                summation += fibonacci;
            }
            fibonacci = fibonacciPredecessor + fibonacciPredecessor2;
            fibonacciPredecessor2 = fibonacciPredecessor;
            fibonacciPredecessor = fibonacci;
        }
        return summation;
    }
}