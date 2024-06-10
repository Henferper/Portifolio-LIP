import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        number = in.nextInt();
        result = number * number;

        System.out.println("Seu numero escrito é: "+result);
    }
}