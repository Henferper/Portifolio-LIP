import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double media;
        System.out.println("Escreva a Média do aluno: ");
        media = in.nextDouble();
        if (media >= 8.5) {
            System.out.println("A");
        } else {
            if (media >= 7) {
                System.out.println("B");
            } else {
                if (media >= 5) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }

            }
        }
    }
}