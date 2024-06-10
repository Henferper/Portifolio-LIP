import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a velocidade em km/h: ");
        km = in.nextDouble();
        ms = km / 3.6;

        System.out.println("A velocidade em m/s é: " + ms + " m/s");
    }
}