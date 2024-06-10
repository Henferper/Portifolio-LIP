import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor, i, resultado = 1;
        do {
            System.out.println("Digite um Número Inteiro:");
            valor = in.nextInt();
        }while (valor <0);

        for (i = 1; i <= valor; i++) {
            resultado = resultado * i;
        }
        System.out.println(+valor+"! é: " + resultado);
    }
}
