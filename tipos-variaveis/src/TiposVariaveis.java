public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World");

        int numero = 1;

        numero = 3;
        
        System.out.println(numero);

        final double VALOR_PI = 3.14;

       int modulo = 15 % 2;
       System.out.println(modulo);

        System.err.println(VALOR_PI);

        String nomeCompleto = "Thiago " + "Pires";

        System.out.println(nomeCompleto);

         String concatenacao = "?";
         concatenacao = 1 + 1 + 1 + "1";
         System.out.println(concatenacao);
         concatenacao = 1 + "1" + 1 + 1;
         System.out.println(concatenacao);
    }
}
