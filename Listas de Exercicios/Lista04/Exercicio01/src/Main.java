import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int [] numeros = new int[10];

        int i, j, valor;

        for (i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + " :");
            numeros[i] = in.nextInt();
        }
        for (j = numeros.length-1; j >= 0; j--) {
            System.out.println(numeros[j]);
        }
    }
}