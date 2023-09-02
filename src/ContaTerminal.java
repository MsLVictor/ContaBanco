import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (// criando scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência!");
            int agencia = scanner.nextInt();

            System.out.println("Digite sua Conta!");
            String conta = scanner.next();

            System.out.println("Digite seu Nome completo!");
            String nomeCompleto = scanner.next();

            System.out.println("Digite o valor a Depositar");
            float valor = scanner.nextFloat();

            System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + valor + " já está disponível para saque");
        }

    }
}
