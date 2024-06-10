import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1, nota2, media;
        System.out.println("Escreva a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Escreva a segunda nota: ");
        nota2 = in.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media>= 50){
            System.out.println("Aprovado com "+media);
        }
        else {
            System.out.println("Reprovado com "+media);
        }

    }
}

