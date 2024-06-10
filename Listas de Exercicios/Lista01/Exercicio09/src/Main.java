
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, milha;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a distancia em kilometros: ");
        km = in.nextDouble();
        milha = km / 1.62;

        System.out.println("A distancia é: " + milha + " milhas");
    }
}