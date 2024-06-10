import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long valor1, valor2, valor3, entrada;
        valor1 = 0;
        valor2 = 1;

        System.out.println("Digite o número de termos: ");
        entrada = in.nextLong();

        System.out.println("1º termo = " + valor1);
        System.out.println("2º termo = " + valor2);

        for (int i = 3; i <= entrada; i++) {
            valor3 = valor1 + valor2;
            System.out.println(i + "º termo = " + valor3);
            valor1 = valor2;
            valor2 = valor3;
        }
    }
}
