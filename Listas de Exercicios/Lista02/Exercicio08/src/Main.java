import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor, par, impar;
        System.out.println("Digite o primeiro valor: ");
        valor = in.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O número " + valor + " é par");
        } else {
            System.out.println(("O número " + valor + " é ímpar"));
        }
    }
}