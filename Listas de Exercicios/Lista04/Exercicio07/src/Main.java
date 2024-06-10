import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] matriz = {
                          { 1, 2, 3, 4, 5},
                          { 6, 7, 8, 9,10},
                          {11,12,13,14,15},
                          {16,17,18,19,20},
                          {21,22,23,24,25}};
        int coluna_soma,linha_soma,maior_linha_soma,maior_coluna_soma;

        for (int i=0;i<matriz.length;i++) {
            coluna_soma = 0;
            linha_soma = 0;
            for (int j=0;j<matriz.length;j++){
                linha_soma+= matriz [i][j]; // Soma
                coluna_soma+= matriz [j][i]; // Soma
            }
            if (i==0){
                maior_linha_soma = coluna_soma;
                maior_coluna_soma = linha_soma;
            }else{
                if(coluna_soma>maior_coluna_soma){

                }
            }
        }
    }
}