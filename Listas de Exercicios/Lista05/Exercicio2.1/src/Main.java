import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva um valor inteiro: ");
        int entrada = in.nextInt();
        int resultado = mult(entrada);
        System.out.println("O resultado é: " + resultado);
    }
    static int mult(int entrada) {
        if(entrada==1)
            return 1;
        return entrada*mult(entrada-1);
    }
}