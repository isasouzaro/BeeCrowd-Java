import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
