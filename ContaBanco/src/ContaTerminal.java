import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao banco: Digite o numero da conta");
        int numero = scanner.nextInt();
        System.out.println("Digite o numero da agencia");
        String agencia = scanner.next();
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    
    }
    
    
}