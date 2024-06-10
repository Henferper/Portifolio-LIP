import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada;
        int [] numeros = {0,2,4,6,8,9,17,19,24,27,37,50,60,99};
        System.out.println("Digite um valor inteiro");
        entrada = in.nextInt();
        if (metade(numeros,entrada)==-1)
            System.out.println("Não encontrado");
        else
            System.out.println("Valor encontrado no index " + metade(numeros, entrada));
    }
    static int metade(int[] m, int valor) {
        int ptrEnd = m.length - 1;
        int ptrStart = 0;

        while (ptrStart <= ptrEnd) {
            int resultado = (ptrStart + ptrEnd) / 2;

            if (valor == m[resultado]) {
                return resultado;
            } else if (valor > m[resultado]) {
                ptrStart = resultado + 1;
            } else {
                ptrEnd = resultado - 1;
            }
        }
        return -1;
    }
}