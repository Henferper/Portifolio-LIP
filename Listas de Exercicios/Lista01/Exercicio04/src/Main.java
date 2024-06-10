import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1,nota2,media;

        Scanner in = new Scanner(System.in);
        System.out.println("Escreva a primeira nota: ");
        nota1 = in.nextInt();
        System.out.println("Escreva a segunda nota: ");
        nota2 = in.nextDouble();
        media = (nota1+nota2)/2;
        System.out.println("A media é: " + media);
    }
}