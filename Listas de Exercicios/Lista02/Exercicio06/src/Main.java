import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        System.out.println("Digite um valor entre 5 e 9: ");
        valor = in.nextInt();
        if (valor >= 5 && valor <= 9) {
            System.out.println("Você Selecionou o número " + valor);
        } else {
            System.out.println("Número Inválido");

        }
    }
}