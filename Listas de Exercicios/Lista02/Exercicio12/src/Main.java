import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1,valor2,operacao, resultado;
        System.out.println("Digite o primeiro valor: ");
        valor1 = in.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = in.nextInt();
        System.out.println("Menu");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");

        System.out.println("Escolha umas das Opções: ");
        operacao = in.nextInt();

        switch (operacao) {
            case 1:
                resultado = valor1 + valor2;
                System.out.println(valor1 + " + "+valor2+" = " + resultado);
                break;

            case 2:
                resultado = valor1 - valor2;
                System.out.println(valor1 + " - "+valor2+" = " + resultado);
                break;

            case 3:
                resultado = valor1 * valor2;
                System.out.println(valor1 + " * "+valor2+" = " + resultado);
                break;

            case 4:
                resultado = valor1 / valor2;
                System.out.println(valor1 + " / "+valor2+" = " + resultado);
                break;
            }
        }
    }