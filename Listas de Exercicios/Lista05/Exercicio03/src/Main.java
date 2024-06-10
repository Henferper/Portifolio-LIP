import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um valor inteiro para a base e o expoente: ");
        int base = in.nextInt();
        int exp = in.nextInt();
        int resultado = funcao(base,exp);
        System.out.println("O resultado é: " + resultado);
    }
    static int funcao(int base,int exp) {
        int resultado = 1,i;
        if (exp<1) {
            resultado = 1;
        }else {
            for (i=0;i<exp;i++){
                resultado *= base;
            }
        }
        return resultado;
    }
}