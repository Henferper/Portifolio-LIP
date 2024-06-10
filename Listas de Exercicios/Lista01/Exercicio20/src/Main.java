import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int coeA, coeB, coeC, ope1, ope2, rai1, rai2;

        System.out.println("Escreva a primeira raiz: ");
        rai1 = in.nextInt();
        System.out.println("Escreva a segunda raiz: ");
        rai2 = in.nextInt();

        coeA = 1;
        coeB = -(rai1 + rai2);
        coeC = rai1 * rai2;

        System.out.println("A equação de segundo grau é = X² + "+coeB+"X + "+coeC+" = 0");
    }
}