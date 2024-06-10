
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, milha;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a distancia em milhas: ");
        milha = in.nextDouble();
        km = milha * 1.6093;

        System.out.println("A distancia é: " + km + " km");
    }
}