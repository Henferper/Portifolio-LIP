import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a,b,c,delta,delta_valor,x1,x2;
        System.out.println("Digite o coeficiente A: ");
        a = in.nextDouble();
        System.out.println("Digite o coeficiente B: ");
        b = in.nextDouble();
        System.out.println("Digite o coeficiente C: ");
        c = in.nextDouble();

        delta = b * b - 4 * a * c;
        delta_valor = Math.sqrt(delta);
        x1 = (-b + delta_valor) / (2 * a);
        x2 = (-b - delta_valor) / (2 * a);

        if (delta < 0) {
            System.out.println("Equação sem Raiz" );
        } else {
            System.out.println("X1 = "+x1);
            System.out.println("X2 = "+x2);
        }
    }
}