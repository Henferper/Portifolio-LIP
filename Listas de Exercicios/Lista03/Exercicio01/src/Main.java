import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int resul,valor1,i;
        System.out.println("Digite um número Inteiro");
        valor1 = in.nextInt();
        for (i =0; i <=10;i++){

           resul = i * valor1;
           System.out.println(valor1+" X "+i+" = " + resul);
        }
    }
}