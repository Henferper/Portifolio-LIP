import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base, altura, area;
        System.out.println("Escreva um valor para a base do triângulo: ");
        base = in.nextDouble();
        System.out.println("Escreva um valor para a altura do triângulo: ");
        altura = in.nextDouble();

        area = (base * altura)/2;

        System.out.println("A área do triângulo é: " + area);
    }
}