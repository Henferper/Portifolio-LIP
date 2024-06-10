import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double lado1, lado2, lado3;
        System.out.println("Digite o primeiro lado: ");
        lado1 = in.nextDouble();
        System.out.println("Digite o segundo lado: ");
        lado2 = in.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        lado3 = in.nextDouble();

        // Verificando se os lados formam um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            // Verificando o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles");
            } else {
                System.out.println("O triângulo é escaleno");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }
}
