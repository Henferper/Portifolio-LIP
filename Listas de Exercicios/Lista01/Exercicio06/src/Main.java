import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a velocidade em ms/s: ");
        ms = in.nextDouble();
        km = ms * 3.6;

        System.out.println("A velocidade em km/s é: " + km + " km/s");
    }
}