
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mm, pol;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a distancia em milimetro: ");
        mm = in.nextDouble();
        pol = mm /25.4;

        System.out.println("A distancia em milimetro é: " + pol + " polegadas");
    }
}