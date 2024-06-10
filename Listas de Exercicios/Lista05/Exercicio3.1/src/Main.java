import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um valor inteiro para a base e o expoente: ");
        int base = in.nextInt();
        int exp = in.nextInt();
        int resultado = exponencial(base,exp);
        System.out.println("O resultado é: " + resultado);
    }
    static int exponencial(int base,int exp) {
        if(exp==0)
            return 1;
        return base*exponencial(base,exp-1);
    }
}