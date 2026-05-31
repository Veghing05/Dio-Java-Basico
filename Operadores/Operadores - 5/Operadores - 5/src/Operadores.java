public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Renato";
        String nomeDois = new String("Vegh");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("a nossa codição é verdadeira");
        }

        System.out.println("numeroUm é igual a nnumeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?" + simNao);
    }
}
