import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um valor inteiro: ");
        int entrada = in.nextInt();

        int resultado = funcao(entrada);

        System.out.println("O resultado é: " + resultado);
    }
    static int funcao(int entrada) {
        int resultado = 1;
        for (int i = 1; i <= entrada; i++) {
            resultado *= i;
        }
        return resultado;
    }
}