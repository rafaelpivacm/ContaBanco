import java.util.Scanner;

import model.ContaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine().toUpperCase();
        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
        scanner.close();

    }
}
