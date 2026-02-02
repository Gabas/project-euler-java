package projecteuler.problems;

/**
 * Problema 14:  Calcula a maior corrente possível (onde N até 1.000.000) da Conjectura de Collatz
 */
public class Problem14 {

    /**
     *
     * @return long
     */
    public long solve() {
        long biggestChain = 0;
        long biggestEntry = 0;
        for (long i = 0; i < 1000000; i++) {
            long n = i;
            while (n != 1){
                long currentChain;
                if ((n % 2) == 0) {
                    n = (n/2);
                } else {
                    n = (n*3)+1;
                }
                currentChain++;
                if (currentChain > biggestChain){
                    biggestChain = currentChain;
                    biggestEntry = i;
                }
            }
        }
        System.out.println(biggestChain);
        return biggestChain;
    }
}