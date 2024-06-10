import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long valor, i;
        boolean primo;
        primo = true;

        System.out.println("Digite um número inteiro:");
        valor = in.nextLong();

        if (valor ==1){
            System.out.println("Não é Primo");
        }
        for (i = valor/2; i > 1; i--) {
            if (valor % i == 0) {
                primo = false;
                break;
            }
        }if (primo) {
            System.out.println("É Primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
