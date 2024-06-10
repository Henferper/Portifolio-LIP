import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContaBancaria Conta = new ContaBancaria();

        int opcao, numero;
        double deposito,saque;
        String titular;
        boolean cancelar;


        System.out.println("Cadastro de Conta:");
        System.out.println("NOME do Titular");
        titular = in.nextLine();
        System.out.println("NUMERO da conta:");
        numero = in.nextInt();

        System.out.println("\nDADOS da CONTA:");
        System.out.println("TITULAR: " + titular);
        System.out.println("NUMERO: " + numero+"\n");

        Conta.setTitular(titular);
        Conta.setNumero(numero);
        cancelar = false;

        while (!cancelar) {
            System.out.println("ESCOLHA UMA DAS OPÇÕES");
            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Verificar Saldo");
            System.out.println("4.Cancelar");
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nDESEJA DEPOSITAR QUANTO?");
                    deposito = in.nextDouble();
                    ContaBancaria.depositar(deposito);
                    break;
                case 2:
                    System.out.println("\nDESEJA SACAR QUANTO?");
                    saque = in.nextDouble();
                    Conta.terminalSaque(saque);
                    Conta.sacar(saque);
                    break;
                case 3:
                    System.out.println("\nSEU SALDO ATUAL É DE: R$"+Conta.getSaldo());
                    break;
                case 4:
                    System.out.println("\nVOCÊ SAIU DA CONTA");
                    cancelar = true;
                    break;
                default:
                    System.out.println("OPÇÃO ERRADA");
            }
        }
    }
}