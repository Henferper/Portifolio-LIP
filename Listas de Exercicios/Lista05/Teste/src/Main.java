import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada,resultado;
        System.out.println("Digite um número para serem Somados");
        entrada = in.nextInt();
        resultado = soma(entrada);
        System.out.println("O Resultado é: "+resultado);
    }
    static int soma (int entrada){
        if(entrada==1)
            return 1;
        else
            return entrada+soma(entrada-1);
    }
}