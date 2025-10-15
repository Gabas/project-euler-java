package projecteuler.problems;

/**
 * Problema 4: Maior palíndromo feito a partir do produto de dois números com 3 algarismos.
 */
public class Problem4 {

    /**
     * Confere se o inteiro passado por parâmetro é um palíndromo
     * @param num int
     * @return boolean
     */
    private boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        return numStr.contentEquals(new StringBuilder(numStr).reverse());
    }

    /**
     *
     * @return int
     */
    public int solve() {
        int biggest = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int num = i * j;
                if (isPalindrome(num) && (num > biggest)) {
                    biggest = num;
                }
            }
        }
        return biggest;
    }
}