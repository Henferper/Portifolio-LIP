import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valor, raiz;
        System.out.println("Escreva um valor do tipo Real: ");
        valor = in.nextDouble();
        if (valor > 0){
        raiz =Math.sqrt(valor);
            System.out.println("O valor da Raiz é: "+raiz);
        }
        else {
            System.out.println("Valor inválido!");
        }

    }
}

