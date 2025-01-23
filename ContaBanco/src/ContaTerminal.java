import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Definindo o scanner para usar o padrão de localidade dos EUA (para aceitar ponto como separador decimal)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura do número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();  // Lê o número da conta

        scanner.nextLine();  // Limpa o buffer de entrada após o nextInt()

        // Leitura da agência (permitindo que o hífen seja aceito)
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine(); // Lê a agência como texto

        // Leitura do nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        // Leitura do saldo (aceitando ponto como separador decimal)
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble(); // Lê o saldo

        // Exibe a mensagem final com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + 
                " já está disponível para saque.");
    }
}
