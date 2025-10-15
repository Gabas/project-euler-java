package projecteuler.problems;

/**
 * Problema 5: Menor número divisível pelos números de 1 a 20.
 */
public class Problem5 {

    /**
     * Confere se o inteiro passado por parâmetro é divisível por todos os números naturais menores/igual a 20
     * @param num int
     * @return boolean
     */
    private boolean checkDivisibleByAllNumbersBelow20(int num) {
        for (int i = 1; i <= 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return int
     */
    public int solve() {
        int num = 20;
        while (!checkDivisibleByAllNumbersBelow20(num)) {
            num += 20;
        }
        return num;
    }
}