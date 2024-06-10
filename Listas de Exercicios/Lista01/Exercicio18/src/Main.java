import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int coeA, coeB, Res;

        System.out.println("Escreva o coeficiente a: ");
        coeA = in.nextInt();
        System.out.println("Escreva o coeficiente b: ");
        coeB = in.nextInt();

        if (coeA >= 1 && coeB>=1){
            Res = (- coeB) / coeA;
            System.out.println("O resultado da equação "+coeA+"X + "+coeB+"= "+Res);
        }
        else {
            System.out.println("Escreva os dois coeficientes acima de 0: ");
        }

    }
}