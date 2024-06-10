import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double raio, base,altura, volume, pi;
        pi = 3.1;
        System.out.println("Escreva um valor para o raio da base do cone: ");
        raio = in.nextDouble();
        System.out.println("Escreva um valor para a altura do cone: ");
        altura = in.nextDouble();

        base = pi * (raio*raio);
        volume = (base * altura)/3;

        System.out.println("O volume do cilindro é: " + volume);
    }
}