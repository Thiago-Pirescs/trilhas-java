public class Operadores {
    public static void main(String[] args) {

        int n = 0;

        /**
         * while (n <= 1) {
         * System.out.println(n);
         * n++;
         * }
         */

        // 2.2. Estrutura do/while
        // A estrutura do/while é similar ao while, mas garante que o bloco de código
        // será executado pelo menos uma vez,
        // pois a condição é verificada após a execução do bloco.

        /**
         * do {
         * System.out.println(n);
         * n++;
         * } while (n <= 10);
         */

        /**
         * 2.3. Estrutura for
         * A estrutura for é utilizada quando se sabe a quantidade de repetições. É uma
         * forma compacta de inicializar uma variável,
         * definir uma condição de parada e incrementar ou decrementar essa variável.
         * for (inicialização; condição; incremento) {
         * // Bloco de comando
         * }
         */

        for( n= 1; n <= 10; n++) {
            System.out.println(n);
        }
        
    }
}
