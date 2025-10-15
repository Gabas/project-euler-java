package projecteuler.problems;

/**
 * Problema 9: Produto do triângulo pitagórico em que a+b+c = 1000.
 * A fonte original contém um erro no comentário, que se refere ao problema 8.
 */
public class Problem9 {

    /**
     *
     * @return int
     */
    public int solve() {
        for (int m = 2; m < 100; m++) {
            for (int n = 1; n < m; n++) {
                // Fórmula de Euclides para gerar ternas pitagóricas
                int a = m * m - n * n;
                int b = 2 * m * n;
                int c = m * m + n * n;
                int soma = a + b + c;

                if (1000 % soma == 0) {
                    int k = 1000 / soma;
                    a *= k;
                    b *= k;
                    c *= k;
                    return a * b * c;
                }
            }
        }
        return -1; // Não encontrou
    }
}