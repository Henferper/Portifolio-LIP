import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean palindromo = false;
        String palavra;
        System.out.println("Digite uma frase ou palavra:");
        palavra = scanner.nextLine();

        char[] caracteres = new char[palavra.length()];

        for (int i = 0,j = palavra.length()-1; i <= j; i++,j--) {
            caracteres[i] = palavra.charAt(i);
            if(caracteres[i]==caracteres[j]) {
                palindromo = true;
            }else{
                palindromo = false;
            }
        }
        if(palindromo){
            System.out.println("É palindromo");
        }else{
            System.out.println("Não é palindromo");
        }
    }
}