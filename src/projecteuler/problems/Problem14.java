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
        
        for (long i = 1; i < 1000000; i++) {
            long currentChain = 1;
            long n = i;
            while (n != 1){
                
                // A conjectura em si
                if ((n % 2) == 0) {
                    n = (n/2);
                } else {
                    n = (n*3)+1;
                }

                currentChain++;
                // Verifica se a corrente atual é a maior dentre todas

                if (currentChain > biggestChain){
                    biggestChain = currentChain;
                    biggestEntry = i;
                }
            }
        }
        return biggestEntry;
    }
}