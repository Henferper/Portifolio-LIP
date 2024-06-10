import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media, peso1, peso2;
        boolean notasValidas = false;
        peso1 = 1;
        peso2 = 2;

        while (!notasValidas) {
            System.out.println("Escreva a primeira nota entre 0 e 10: ");
            nota1 = in.nextDouble();

            System.out.println("Escreva a segunda nota entre 0 e 10: ");
            nota2 = in.nextDouble();

            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
                notasValidas = true;
                media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
                System.out.println("A média é: " + media);
            } else {
                System.out.println("Alguma das notas está fora do intervalo permitido. Por favor, reescreva as notas.");
            }
        }
    }
}
