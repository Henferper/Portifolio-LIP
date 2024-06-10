import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,resultado;
            for (j = 1; j <=10; j++) {
                System.out.println(" ");
                for(i = 1; i <=10; i++){
                    resultado = i *j;
                    System.out.println(i+" X "+j+" = " +resultado );
            }
        }
    }
}
