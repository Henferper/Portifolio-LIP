import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2;
        System.out.println("Escreva um valor: ");
        valor1 = in.nextInt();
        System.out.println("Escreva mais um valor: ");
        valor2 = in.nextInt();
        if (valor1 > valor2){
            System.out.println(valor1+" é maior que "+valor2);
        }
        else {
            System.out.println(valor2+" é maior que "+valor1);
        }

    }
}

