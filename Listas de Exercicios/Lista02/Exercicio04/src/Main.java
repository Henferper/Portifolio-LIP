import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1, nota2, nota3,media1, media2;
        System.out.println("Escreva a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Escreva a segunda nota: ");
        nota2 = in.nextDouble();
        media1 = (nota1 + nota2) / 2;
        if (media1>= 50){
            System.out.println("Aprovado com "+media1);
        }
        else if (media1 < 50){
            System.out.println("Nota Insuficiente ("+media1+"). Escreva a nota da Recuperação: ");
            nota3 = in.nextDouble();
            media2 = (media1 + nota3) / 2;
            if (media2 >= 50){
                System.out.println("Aprovado com "+media2);
            }
            else {
                System.out.println("Reprovado com "+media2);
            }
        }

    }
}

