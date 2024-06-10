import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double raio, area, pi;
        pi = 3.14;

        System.out.println("Escreva o valor do raio: ");
        raio = in.nextDouble();
        area = pi * (raio * raio);

        System.out.println("A area do círculo é de:" + area);

    }
}