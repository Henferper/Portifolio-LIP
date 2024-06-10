import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior, menor,n,i;
        maior = 0;
        menor = 0;

        for (i = 0; i < 5; i++) {
            System.out.println("Digite n"+(i+1) + ":");
            n = scanner.nextInt();
            if(i==0){
                maior = n;
                menor = n;
            }else {
                if(n > maior)
                    maior = n;
                if (n < menor)
                    menor = n;
                }
        }
        System.out.println("Maior = " +maior);
        System.out.println("Menor = " +menor);
    }
}