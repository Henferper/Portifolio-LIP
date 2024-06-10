
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cel, fah;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a temperatura em Celcius: ");
        cel = in.nextDouble();
        fah = (cel * 9/5) + 32;

        System.out.println("A temperatura é: " + fah + " °F");
    }
}