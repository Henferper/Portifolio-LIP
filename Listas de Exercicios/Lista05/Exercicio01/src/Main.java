import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um valor inteiro: ");
        int entrada = in.nextInt();
        int resultado = somar(entrada);
        System.out.println("O resultado é: " + resultado);
    }
        static int somar(int entrada) {
        int resultado = 0;
        for (int i = 0; i <= entrada; i++) {
            resultado += i;
        }
        return resultado;
    }
}