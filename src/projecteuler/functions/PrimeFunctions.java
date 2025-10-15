package projecteuler.functions;

public class PrimeFunctions {

    /**
     * Confere se o inteiro passado por parâmetro é primo
     * @param num int
     * @return boolean
     */
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int divider = 3; divider * divider <= num; divider += 2) {
            if (num % divider == 0) {
                return false;
            }
        }
        return true;
    }

}
