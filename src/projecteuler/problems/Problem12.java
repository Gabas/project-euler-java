package projecteuler.problems;

/**
 * Problema 12: Número triangular divisível.
 */
public class Problem12 {

    /**
     * 
     * @return int
     */
    public int solve() {
        int n = 1;
        while (true) {
            // fórmula de Gauss para número triangular
            long triangleNumber = (long) n * (n + 1) / 2;

            int quantityOfDivisors = countDivisors(triangleNumber);

            if (quantityOfDivisors > 500) {
                return (int) triangleNumber;
            }
            n++;
        }
    }

    /**
     * @return int
     */
    private int countDivisors(long num) {
        int count = 0;
        double sqrt = Math.sqrt(num);
        
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                // Se o divisor for a própria raiz quadrada (ex: 6 em 36), conta apenas uma vez
                if (i * i == num) {
                    count++;
                } else {
                    // Caso contrário, conta o divisor 'i' e o seu par 'num/i'
                    count += 2;
                }
            }
        }
        return count;
    }
}