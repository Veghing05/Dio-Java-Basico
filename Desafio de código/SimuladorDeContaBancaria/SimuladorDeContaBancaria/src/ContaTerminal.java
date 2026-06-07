import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 1. Numero da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // Sinalizando que irá pra uma proxima linha
        scanner.nextLine(); 

        // 2. Solicitando e Lendo a Agência String pois usa o (-).
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // 3. Solicitando e lendo o Nome do Cliente 
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // 4. Solicitando e lendo o Saldo.
        System.out.println("Por favor, digite o Saldo inicial:");
        double saldo = scanner.nextDouble();

        // Fechando o scanner depois de ler de todos os dados
        scanner.close();

        // 5. Exibindo a mensagem final 
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}