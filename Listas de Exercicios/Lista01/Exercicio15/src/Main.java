import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double raio, base,altura, volume, pi;
        pi = 3.14;
        System.out.println("Escreva um valor para o raio da base do cilindro: ");
        raio = in.nextDouble();
        System.out.println("Escreva um valor para a altura do cilindro: ");
        altura = in.nextDouble();

        base = pi * (raio*raio);
        volume = base * altura;

        System.out.println("O volume do cilindro é: " + volume);
    }
}