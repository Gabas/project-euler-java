package projecteuler.problems;

import projecteuler.functions.PalindromeFunctions;

/**
 * Problema 4: Maior palíndromo feito a partir do produto de dois números com 3 algarismos.
 */
public class Problem4 {

    /**
     *
     * @return int
     */
    public int solve() {
        int biggest = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int num = i * j;
                if (PalindromeFunctions.isPalindrome(num) && (num > biggest)) {
                    biggest = num;
                }
            }
        }
        return biggest;
    }
}