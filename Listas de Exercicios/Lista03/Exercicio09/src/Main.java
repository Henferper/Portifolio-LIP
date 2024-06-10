import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, resultado, resposta;
        boolean acerto;
        acerto = true;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                resultado = i * j;
                System.out.print(i + " X " + j + " = ");
                resposta = in.nextInt();
                if (resultado != resposta) {
                    System.out.println("Errou!");
                    acerto = false;
                    break;
                }
            }
            if (!acerto) {
                System.out.println("O jogo acabou.");
                break;
            }
        }
    }
}
