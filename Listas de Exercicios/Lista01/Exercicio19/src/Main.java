import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int coeA, coeB, coeC, delta1, delta2, rai1, rai2;

        System.out.println("Escreva o coeficiente a: ");
        coeA = in.nextInt();
        System.out.println("Escreva o coeficiente b: ");
        coeB = in.nextInt();
        System.out.println("Escreva o coeficiente c: ");
        coeC = in.nextInt();

        delta1 = (coeB * coeB) - 4 * coeA * coeC;
        delta2 = (int) Math.sqrt(delta1);
        rai1 = (- coeB - delta2)/ 2 * coeA;
        rai2 = (- coeB + delta2)/ 2 * coeA;


            System.out.println("Os resultados da equação "+coeA+"X² + "+coeB+" + "+coeC+" =");
            System.out.println("X1= " +rai1+ " e X2= " +rai2);
    }
}