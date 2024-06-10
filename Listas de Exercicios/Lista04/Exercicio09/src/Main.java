import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = {{3, 1, 3},
                          {2, 4, 1},
                          {1, 2, 2}};
        diag_principal(matriz);
    }
    // Static void apenas aponta (m como ponteiro) para a matriz do main
    static void diag_principal(int [][]m) {
        if (m.length == m[0].length){
            for (int i=0,j=m[0].length-1 ; i<m.length && j>= 0; i++,j--) {
                System.out.print(m[i][j] + " | ");
            }
        } else {
            System.out.println("A matriz não é quadrada");
        }
    }
}