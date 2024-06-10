import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long valor1, valor2, NumMenor, NumMaior,i;
        System.out.println("Digite o primeiro Número Inteiro:");
        valor1 = in.nextLong();
        System.out.println("Digite o segundo Número Inteiro:");
        valor2 = in.nextLong();

        NumMaior =Math.max(valor1,valor2);
        NumMenor =Math.min(valor1,valor2);

        if (NumMaior > NumMenor) {
            for (i = NumMenor + 1; i < NumMaior; i++) {
                System.out.println(i);
            }
        }
    }
}
