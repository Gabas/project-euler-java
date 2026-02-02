package projecteuler.functions;

public class PalindromeFunctions {
    
    /**
     * Confere se o inteiro passado por parâmetro é um palíndromo
     * @param num int
     * @return boolean
     */
    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        return numStr.contentEquals(new StringBuilder(numStr).reverse());
    }

    //IDEA: Criar classe para agrupar função do Problem5.java

}
