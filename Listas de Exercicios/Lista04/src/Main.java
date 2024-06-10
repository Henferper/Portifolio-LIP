import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int valor,i;
                final int tamanho = 5;
                int[] numeros = new int [tamanho];

                System.out.println("Digite "+tamanho+"Números Inteiros:");
                for (i =0;i<tamanho;i++){
                    numeros[i] = in.nextInt();
                }
    }
}