import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um Numero: ");
        number = in.nextInt();
        result = (int) Math.pow(number,2);
        System.out.println("O Quadrado do numero digitado é: "+result);
    }

}